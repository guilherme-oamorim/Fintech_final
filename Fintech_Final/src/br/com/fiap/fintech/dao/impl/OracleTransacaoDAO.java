package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import br.com.fiap.fintech.bean.Categoria;
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
			stmt.setInt(2, transacao.getCategoria().getId_categoria());
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

			String sql = "UPDATE t_ftc_transacao SET id_categoria = ?, dt_transacao = ?, vl_transacao = ?, ds_transacao = ? "
					+ "WHERE id_trasacao = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, transacao.getCategoria().getId_categoria());
			Date data = Date.valueOf(transacao.getDt_transacao());
			stmt.setDate(2, data);
			stmt.setFloat(3, transacao.getVl_transacao());
			stmt.setString(4, transacao.getDs_transacao());
			stmt.setInt(5, transacao.getId_transacao());

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

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "DELETE FROM t_ftc_transacao WHERE id_trasacao = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, id_transacao);

			stmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
			throw new DBException("Erro ao remover");

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
	public Transacao buscar(int id_transacao) {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		Transacao transacao = new Transacao();
		Categoria categoria = new Categoria();

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM t_ftc_transacao INNER JOIN t_ftc_categoria "
					+ "t_ftc_transacao.id_categoria = t_ftc_categoria.id_categoria "
					+ "WHERE t_ftc_transacao.id_transacao = ?");

			stmt.setInt(1, id_transacao);

			rs = stmt.executeQuery();

			if (rs.next()) {
				transacao.setId_transacao(rs.getInt("id_transacao"));
				transacao.setId_login(rs.getInt("id_login"));
				Date data = rs.getDate("dt_transacao");
				transacao.setDt_transacao(data.toLocalDate());
				transacao.setVl_transacao(rs.getFloat("vl_transacao"));
				transacao.setDs_transacao(rs.getString("ds_Transacao"));
				
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNm_categoria(rs.getString("nm_categoria"));
				Date dataCategoria = rs.getDate("dt_categoria");
				categoria.setDt_criacao(dataCategoria.toLocalDate());
				categoria.setDs_categoria(rs.getString("ds_categoria"));
				
				transacao.setCategoria(categoria);
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

		return transacao;
	}

	@Override
	public List<Transacao> listar() {

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<Transacao> lista = new ArrayList<Transacao>();

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM t_ftc_transacao INNER JOIN t_ftc_categoria "
					+ "ON ftc_transacao.id_categoria = t_ftc_categoria.id_categoria "
					+ "ORDER BY id_transacao ASC");

			rs = stmt.executeQuery();

			while (rs.next()) {
				Transacao transacao = new Transacao();
				transacao.setId_transacao(rs.getInt("id_transacao"));
				transacao.setId_login(rs.getInt("id_login"));
				Date data = rs.getDate("dt_transacao");
				transacao.setDt_transacao(data.toLocalDate());
				transacao.setVl_transacao(rs.getFloat("vl_transacao"));
				transacao.setDs_transacao(rs.getString("ds_Transacao"));
				
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("id_categoria"));
				categoria.setNm_categoria(rs.getString("nm_categoria"));
				Date dataCategoria = rs.getDate("dt_categoria");
				categoria.setDt_criacao(dataCategoria.toLocalDate());
				categoria.setDs_categoria(rs.getString("ds_categoria"));
				
				transacao.setCategoria(categoria);

				lista.add(transacao);
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
