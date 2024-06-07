package br.com.fiap.fintech.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class FintechDbManager {

	public static Connection obterConexao() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", 
					"RM553456", "291102");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}