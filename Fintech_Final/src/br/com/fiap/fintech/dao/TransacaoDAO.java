package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.singleton.FintechDbManager;

public class TransacaoDAO {

	private Connection conexao;

	public TransacaoDAO() {
		super();
	}

	public TransacaoDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}

	public void Cadastrar(Transacao transacao) {

		PreparedStatement stmt = null;

		try {

			conexao = FintechDbManager.obterConexao();

			String sql = "INSERT INTO t_ftc_transacao (id_transacao, id_perfil, id_categoria, dt_transacao, vl_transacao, ds_transacao) "
					+ "VALUES (SQ_TRANSACAO.NEXTVAL, ?, ?, ?, ?, ?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, transacao.getId_perfil());
			stmt.setInt(2, transacao.getId_categoria());
			Date data = Date.valueOf(transacao.getDt_transacao());
			stmt.setDate(3, data);
			stmt.setFloat(4, transacao.getVl_transacao());
			stmt.setString(5, transacao.getDs_transacao());

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
}

	public List<Transacao> ListarTodos() {

		List<Transacao> lista = new ArrayList<Transacao>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = FintechDbManager.obterConexao();

			stmt = conexao.prepareStatement("SELECT * FROM t_ftc_transacao WHERE id_perfil = ? "
					+ "ORDER BY ID_TRANSACAO ASC");
			stmt.setInt(1, 1);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Transacao transacao = new Transacao();
				transacao.setId_transacao(rs.getInt("id_transacao"));
				transacao.setId_perfil(rs.getInt("id_perfil"));
				transacao.setId_categoria(rs.getInt("id_categoria"));
				Date data = rs.getDate("dt_transacao");
				transacao.setDt_transacao(data.toLocalDate());
				transacao.setVl_transacao(rs.getFloat("vl_transacao"));
				transacao.setDs_transacao(rs.getString("ds_Transacao"));

				lista.add(transacao);
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