package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.singleton.FintechDbManager;

public class CategoriaDAO {

	private Connection conexao;

	public void Cadastrar(Categoria categoria) {

		PreparedStatement stmt = null;

		try {

			conexao = FintechDbManager.obterConexao();

			String sql = "INSERT INTO t_ftc_categoria (id_categoria, nm_categoria, dt_criacao, ds_categoria)"
					+ "VALUES (SQ_CATEGORIA.NEXTVAL,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, categoria.getNm_categoria());
			Date data = Date.valueOf(categoria.getDt_criacao());
			stmt.setDate(2, data);
			stmt.setString(3, categoria.getDs_categoria());

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Categoria> listarTodos() {

		List<Categoria> lista = new ArrayList<Categoria>();

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = FintechDbManager.obterConexao();

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

			stmt.close();
			rs.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}
}