package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.singleton.FintechDbManager;

public class InvestimentoDAO {
	private Connection conexao;

	public void Cadastrar(Investimento investimento) {
		PreparedStatement stmt = null;

		try {
			conexao = FintechDbManager.obterConexao();
			String sql = "INSERT INTO t_ftc_investimento (id_invest, id_perfil, nm_invest, vl_invest, dt_invest, ds_invest, dt_conclusao)"
					+ "VALUES (SQ_INVEST.NEXTVAL,?,?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, investimento.getId_perfil());
			stmt.setString(2, investimento.getNm_invest());
			stmt.setFloat(3, investimento.getVl_invest());
			Date data = Date.valueOf(investimento.getDt_invest());
			stmt.setDate(4, data);
			stmt.setString(5, investimento.getDs_invest());
			Date dataConclusao = Date.valueOf(investimento.getDt_conclusao());
			stmt.setDate(6, dataConclusao);

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Investimento> listarTodos() {

		List<Investimento> lista = new ArrayList<Investimento>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = FintechDbManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_INVESTIMENTO ORDER BY ID_INVEST ASC");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Investimento investimento = new Investimento();
				investimento.setId_invest(rs.getInt("ID_INVEST"));
				investimento.setId_perfil(rs.getInt("ID_PERFIL"));
				investimento.setNm_invest(rs.getString("NM_INVEST"));
				investimento.setVl_invest(rs.getFloat("VL_INVEST"));

				Date data = rs.getDate("DT_INVEST");
				investimento.setDt_invest(data.toLocalDate());

				investimento.setDs_invest(rs.getString("DS_INVEST"));

				Date dataConclusao = rs.getDate("DT_CONCLUSAO");
				investimento.setDt_conclusao(dataConclusao.toLocalDate());

				lista.add(investimento);
			}
			
			stmt.close();
			rs.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return lista;
	}
}
