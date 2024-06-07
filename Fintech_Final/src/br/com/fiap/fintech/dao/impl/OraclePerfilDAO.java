package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Perfil;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OraclePerfilDAO {

	private Connection conexao;

	public void Cadastrar(Perfil perfil) {

		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getConnection();

			String sql = "INSERT INTO T_FTC_PERFIL (id_perfil, id_login, nm_perfil, ds_senha, vl_saldo, dt_criacao) "
					+ "VALUES (SQ_PERFIL.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, perfil.getId_login());
			stmt.setString(2, perfil.getNm_perfil());
			stmt.setString(3, perfil.getDs_senha());
			stmt.setDouble(4, perfil.getVl_saldo());
			Date data = Date.valueOf(perfil.getDt_criacao());
			stmt.setDate(5, data);

			stmt.executeUpdate();
			stmt.close();
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Perfil> listarTodos() {

		List<Perfil> lista = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConnectionManager.getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_Perfil ORDER BY id_perfil ASC");
			rs = stmt.executeQuery();

			while (rs.next()) {
				Perfil perfil = new Perfil();
				perfil.setId_perfil(rs.getInt("id_perfil"));
				perfil.setId_login(rs.getInt("id_login"));
				perfil.setNm_perfil(rs.getString("nm_perfil"));
				perfil.setDs_senha(rs.getString("ds_senha"));
				perfil.setVl_saldo(rs.getDouble("vl_saldo"));
				Date data = rs.getDate("dt_criacao");
				perfil.setDt_criacao(data.toLocalDate());

				lista.add(perfil);
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