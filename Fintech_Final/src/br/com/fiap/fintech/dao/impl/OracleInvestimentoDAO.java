package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.dao.InvestimentoDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;
import br.com.fiap.fintech.exception.DBException;

public class OracleInvestimentoDAO implements InvestimentoDAO {

	private Connection conexao;

	public OracleInvestimentoDAO() {
		super();
	}

	public OracleInvestimentoDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(Investimento investimento) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "INSERT INTO t_ftc_investimento (id_invest, id_login, nm_invest, vl_invest, dt_invest, ds_invest, dt_conclusao)"
					+ "VALUES (SQ_INVEST.NEXTVAL,?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, investimento.getId_login());
			stmt.setString(2, investimento.getNm_invest());
			stmt.setFloat(3, investimento.getVl_invest());
			Date data = Date.valueOf(investimento.getDt_invest());
			stmt.setDate(4, data);
			stmt.setString(5, investimento.getDs_invest());
			Date dataConclusao = Date.valueOf(investimento.getDt_conclusao());
			stmt.setDate(6, dataConclusao);

			stmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DBException("Erro ao cadastrar");

		} finally {
			try {
				stmt.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void atualizar(Investimento investimento) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "UPDATE t_ftc_investimento SET nm_invest = ?, vl_invest = ?, dt_invest = ?, ds_invest = ?, dt_conclusao = ? "
					+ "WHERE id_invest = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, investimento.getNm_invest());
			stmt.setFloat(2, investimento.getVl_invest());
			Date data = Date.valueOf(investimento.getDt_invest());
			stmt.setDate(3, data);
			stmt.setString(4, investimento.getDs_invest());
			Date dataConclusao = Date.valueOf(investimento.getDt_conclusao());
			stmt.setDate(5, dataConclusao);
			stmt.setInt(6, investimento.getId_invest());

			stmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DBException("Erro ao atualizar");

		} finally {
			try {
				stmt.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	@Override
	public Investimento buscar(int id_invest) {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		Investimento investimento = new Investimento();

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_INVESTIMENTO ORDER BY ID_INVEST ASC");

			rs = stmt.executeQuery();

			if (rs.next()) {
				Investimento investimento = new Investimento();
				investimento.setId_invest(rs.getInt("ID_INVEST"));
				investimento.setId_login(rs.getInt("ID_LOGIN"));
				investimento.setNm_invest(rs.getString("NM_INVEST"));
				investimento.setVl_invest(rs.getFloat("VL_INVEST"));

				Date data = rs.getDate("DT_INVEST");
				investimento.setDt_invest(data.toLocalDate());

				investimento.setDs_invest(rs.getString("DS_INVEST"));

				Date dataConclusao = rs.getDate("DT_CONCLUSAO");
				investimento.setDt_conclusao(dataConclusao.toLocalDate());

				lista.add(investimento);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				rs.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}


	@Override
	public List<Investimento> listar(int id_login) {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Investimento> lista = new ArrayList<Investimento>();

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_INVESTIMENTO ORDER BY ID_INVEST ASC");

			rs = stmt.executeQuery();

			while (rs.next()) {
				Investimento investimento = new Investimento();
				investimento.setId_invest(rs.getInt("ID_INVEST"));
				investimento.setId_login(rs.getInt("ID_LOGIN"));
				investimento.setNm_invest(rs.getString("NM_INVEST"));
				investimento.setVl_invest(rs.getFloat("VL_INVEST"));

				Date data = rs.getDate("DT_INVEST");
				investimento.setDt_invest(data.toLocalDate());

				investimento.setDs_invest(rs.getString("DS_INVEST"));

				Date dataConclusao = rs.getDate("DT_CONCLUSAO");
				investimento.setDt_conclusao(dataConclusao.toLocalDate());

				lista.add(investimento);
			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				rs.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}

}