package br.com.fiap.fintech.teste;

import java.util.List;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.dao.impl.OracleCategoriaDAO;
import br.com.fiap.fintech.dao.impl.OracleInvestimentoDAO;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.dao.impl.OracleTransacaoDAO;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		OracleLoginDAO loginDAO = new OracleLoginDAO();
		Login login = new Login();
		Main.inserirLogin(loginDAO, login);
		
		
	}
	
	public static void inserirLogin(OracleLoginDAO dao, Login login) {

		login.setNm_login("Marco");
		login.setDs_email("marcopolo@gmail.com");
		login.setDs_senha("marcopolo");
		login.setVl_saldo(1000);
		login.setDt_criacao(LocalDate.now());

		dao.Cadastrar(login);
	}
}
