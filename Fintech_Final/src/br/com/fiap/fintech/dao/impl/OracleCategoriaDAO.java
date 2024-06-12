package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.dao.CategoriaDAO;
import br.com.fiap.fintech.exception.DBException;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleCategoriaDAO implements CategoriaDAO {

	private Connection conexao;

	public OracleCategoriaDAO() {
		super();
	}

	public OracleCategoriaDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}
	
	@Override
	public void cadastrar(Categoria categoria) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getConnection();

			String sql = "INSERT INTO t_ftc_categoria (id_categoria, nm_categoria, dt_criacao, ds_categoria)"
					+ "VALUES (SQ_CATEGORIA.NEXTVAL,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, categoria.getNm_categoria());
			Date data = Date.valueOf(categoria.getDt_criacao());
			stmt.setDate(2, data);
			stmt.setString(3, categoria.getDs_categoria());
			
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
	public void atualizar(Categoria categoria) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getConnection();

			String sql = "UPDATE t_ftc_categoria SET nm_categoria = ?, dt_criacao = ?, ds_categoria = ? "
					+ "WHERE id_categoria = ?";

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, categoria.getNm_categoria());
			Date data = Date.valueOf(categoria.getDt_criacao());
			stmt.setDate(2, data);
			stmt.setString(3, categoria.getDs_categoria());
			stmt.setInt(4, categoria.getId_categoria());

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
	public void remover(int id_categoria) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getConnection();

			String sql = "DELETE FROM t_ftc_categoria WHERE id_categoria = ?";

			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, id_categoria);
			
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
	public Categoria buscar(int id_categoria) {

		PreparedStatement stmt = null;
		
		ResultSet rs = null;

		Categoria categoria = new Categoria();

		try {

			conexao = ConnectionManager.getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_CATEGORIA WHERE ID_CATEGORIA = ?");
			
			stmt.setInt(1, id_categoria);

			rs = stmt.executeQuery();

			if (rs.next()) {
				categoria.setId_categoria(rs.getInt("ID_CATEGORIA"));
				categoria.setNm_categoria(rs.getString("NM_CATEGORIA"));
				Date data = rs.getDate("dt_criacao");
				categoria.setDt_criacao(data.toLocalDate());
				categoria.setDs_categoria(rs.getString("DS_CATEGORIA"));
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

		return categoria;
	}

		
	@Override
	public List<Categoria> listar() {

		PreparedStatement stmt = null;
		
		ResultSet rs = null;

		List<Categoria> lista = new ArrayList<Categoria>();

		try {

			conexao = ConnectionManager.getConnection();

			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_CATEGORIA ORDER BY ID_CATEGORIA ASC");

			rs = stmt.executeQuery();

			while (rs.next()) {
				Categoria categoria = new Categoria();
				categoria.setId_categoria(rs.getInt("ID_CATEGORIA"));
				categoria.setNm_categoria(rs.getString("NM_CATEGORIA"));
				Date data = rs.getDate("dt_criacao");
				categoria.setDt_criacao(data.toLocalDate());
				categoria.setDs_categoria(rs.getString("DS_CATEGORIA"));

				lista.add(categoria);
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