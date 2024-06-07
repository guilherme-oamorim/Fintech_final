package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Telefone;
import br.com.fiap.fintech.singleton.FintechDbManager;

public class TelefoneDAO {

	private Connection conexao;

	public void Cadastrar(Telefone telefone) {
		PreparedStatement stmt = null;

		try {
			conexao = FintechDbManager.obterConexao();
			String sql = "INSERT INTO T_FTC_TELEFONE (id_telefone, id_login, nr_ddd, nr_telefone)"
					+ "VALUES (SQ_TELEFONE.NEXTVAL, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, telefone.getId_login());
			stmt.setString(2, telefone.getNr_ddd());
			stmt.setString(3, telefone.getNr_telefone());

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Telefone> listarTodos() {

		List<Telefone> lista = new ArrayList<Telefone>();

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = FintechDbManager.obterConexao();
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_TELEFONE ORDER BY id_telefone ASC");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Telefone telefone = new Telefone();
				telefone.setId_telefone(rs.getInt("id_telefone"));
				telefone.setId_login(rs.getInt("id_login"));
				telefone.setNr_ddd(rs.getString("nr_ddd"));
				telefone.setNr_telefone(rs.getString("nr_telefone"));

				lista.add(telefone);
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