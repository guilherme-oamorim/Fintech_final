package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleLoginDAO {

	private Connection conexao;

	public void Cadastrar(Login login) {

		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getConnection();
			String sql = "INSERT INTO t_ftc_login (id_login, nm_login, ds_email, ds_senha, dt_criacao)"
					+ " VALUES (SQ_LOGIN.NEXTVAL,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login.getNm_login());
			stmt.setString(2, login.getDs_email());
			stmt.setString(3, login.getDs_senha());
			Date data = Date.valueOf(login.getDt_criacao());
			stmt.setDate(4, data);

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Login> listarTodos() {

		List<Login> lista = new ArrayList<Login>();

		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConnectionManager.getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_LOGIN ORDER BY ID_LOGIN ASC");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Login login = new Login();
				login.setId_login(rs.getInt("ID_LOGIN"));
				login.setNm_login(rs.getString("NM_LOGIN"));
				login.setDs_email(rs.getString("DS_EMAIL"));
				login.setDs_senha(rs.getString("DS_SENHA"));
				Date data = rs.getDate("dt_criacao");
				login.setDt_criacao(data.toLocalDate());

				lista.add(login);
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