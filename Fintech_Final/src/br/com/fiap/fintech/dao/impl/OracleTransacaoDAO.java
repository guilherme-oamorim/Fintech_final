package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.dao.TransacaoDAO;
import br.com.fiap.fintech.singleton.ConnectionManager;
import br.com.fiap.fintech.exception.DBException;

public class OracleTransacaoDAO implements TransacaoDAO {

	private Connection conexao;

	public OracleTransacaoDAO() {
		super();
	}

	public OracleTransacaoDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(Transacao transacao) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "INSERT INTO t_ftc_transacao (id_transacao, id_login, id_categoria, dt_transacao, vl_transacao, ds_transacao) "
					+ "VALUES (SQ_TRANSACAO.NEXTVAL, ?, ?, ?, ?, ?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, transacao.getId_login());
			stmt.setInt(2, transacao.getId_categoria());
			Date data = Date.valueOf(transacao.getDt_transacao());
			stmt.setDate(3, data);
			stmt.setFloat(4, transacao.getVl_transacao());
			stmt.setString(5, transacao.getDs_transacao());

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
	public void atualizar(Transacao transacao) throws DBException {

		PreparedStatement stmt = null;
		
		try {
		
			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "UPDATE t_ftc_transacao SET id_categoria = ?, dt_transacao = ?, vl_transacao = ?, ds_transacao = ?) WHERE id_trasacao = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, transacao.getId_categoria());
			Date data = Date.valueOf(transacao.getDt_transacao());
			stmt.setDate(2, data);
			stmt.setFloat(3, transacao.getVl_transacao());
			stmt.setString(4, transacao.getDs_transacao());
			stmt.setInt(5, transacao.getId_login());

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
	public void remover(int id_transacao) throws DBException {

		PreparedStatement stmt = null;
		
		// criar funcao
	}
	
	
	@Override
	public Transacao buscar(int id_transacao) throws DBException {

		PreparedStatement stmt = null;
		
		// criar funcao
		
	}
	
	
	@Override
	public List<Transacao> listar() {

		List<Transacao> lista = new ArrayList<Transacao>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM t_ftc_transacao WHERE id_login = ? "
					+ "ORDER BY ID_TRANSACAO ASC");
			stmt.setInt(1, 1);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Transacao transacao = new Transacao();
				transacao.setId_transacao(rs.getInt("id_transacao"));
				transacao.setId_login(rs.getInt("id_login"));
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