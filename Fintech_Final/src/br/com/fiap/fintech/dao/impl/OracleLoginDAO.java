package br.com.fiap.fintech.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.dao.LoginDAO;
import br.com.fiap.fintech.exception.DBException;
import br.com.fiap.fintech.singleton.ConnectionManager;

public class OracleLoginDAO implements LoginDAO {

	private Connection conexao;

	public OracleLoginDAO() {
		super();
	}

	public OracleLoginDAO(Connection conexao) {
		super();
		this.conexao = conexao;
	}

	@Override
	public void cadastrar(Login login) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "INSERT INTO t_ftc_login (id_login, nm_login, ds_email, ds_senha, vl_saldo, dt_criacao)"
					+ " VALUES (SQ_LOGIN.NEXTVAL,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, login.getNm_login());
			stmt.setString(2, login.getDs_email());
			stmt.setString(3, login.getDs_senha());
			stmt.setDouble(4, login.getVl_saldo());
			Date data = Date.valueOf(login.getDt_criacao());
			stmt.setDate(5, data);

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

	
	public boolean validar(String email, String senha) throws DBException {


				PreparedStatement stmt = null;
				ResultSet rs = null;
				try {
					conexao = ConnectionManager.getInstance().getConnection();
					stmt = conexao.prepareStatement("SELECT * FROM TB_USUARIO WHERE DS_EMAIL = ? AND DS_SENHA = ?");
					stmt.setString(1, email);
					stmt.setString(2, senha);
					rs = stmt.executeQuery();

					if (rs.next()){
						return true;
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						stmt.close();
						rs.close();
						conexao.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				return false;
	}

	
	
	
	@Override
	public void atualizar(Login login) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "UPDATE t_ftc_login SET nm_login = ?, ds_email = ?, ds_senha = ?, vl_saldo = ?, dt_criacao = ? "
					+ "WHERE id_login = ?";
			
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, login.getNm_login());
			stmt.setString(2, login.getDs_email());
			stmt.setString(3, login.getDs_senha());
			stmt.setDouble(4, login.getVl_saldo());
			Date data = Date.valueOf(login.getDt_criacao());
			stmt.setDate(5, data);
			stmt.setInt(6, login.getId_login());

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
	
	/* verificar se vai ser usado

	@Override
	public void remover(int id_login) throws DBException {

		PreparedStatement stmt = null;

		try {

			conexao = ConnectionManager.getInstance().getConnection();

			String sql = "DELETE FROM t_ftc_login WHERE id_login = ?";

			stmt = conexao.prepareStatement(sql);

			stmt.setInt(1, id_login);

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
*/
	
	@Override
	public Login buscar(int id_login) {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		Login login = new Login();

		try {
			
			conexao = ConnectionManager.getInstance().getConnection();
			
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_LOGIN WHERE ID_LOGIN = ?");
			
			stmt.setInt(1, id_login);
			
			rs = stmt.executeQuery();

			if (rs.next()) {
				login.setId_login(rs.getInt("ID_LOGIN"));
				login.setNm_login(rs.getString("NM_LOGIN"));
				login.setDs_email(rs.getString("DS_EMAIL"));
				login.setDs_senha(rs.getString("DS_SENHA"));
				login.setVl_saldo(rs.getFloat("VL_SALDO"));
				Date data = rs.getDate("dt_criacao");
				login.setDt_criacao(data.toLocalDate());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
				
			try {
				stmt.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return login;
	}
	
	

	/* verificar se vai ser usado

	@Override
	public List<Login> listar() {

		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<Login> lista = new ArrayList<Login>();

		try {
			
			conexao = ConnectionManager.getInstance().getConnection();
			
			stmt = conexao.prepareStatement("SELECT * FROM T_FTC_LOGIN ORDER BY ID_LOGIN ASC");
			
			rs = stmt.executeQuery();

			while (rs.next()) {
				Login login = new Login();
				login.setId_login(rs.getInt("ID_LOGIN"));
				login.setNm_login(rs.getString("NM_LOGIN"));
				login.setDs_email(rs.getString("DS_EMAIL"));
				login.setDs_senha(rs.getString("DS_SENHA"));
				login.setVl_saldo(rs.getFloat("VL_SALDO"));
				Date data = rs.getDate("dt_criacao");
				login.setDt_criacao(data.toLocalDate());

				lista.add(login);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
				
			try {
				stmt.close();
				conexao.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return lista;
	}
	
	*/
}

