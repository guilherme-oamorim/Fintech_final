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
import br.com.fiap.fintech.exception.DBException;

import java.sql.Date;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws DBException {
		//System.out.println("TESTE");
		System.out.println("INICIADO");
		OracleTransacaoDAO loginDAO = new OracleTransacaoDAO();
		int id_login = 114;
		int id_categoria = 3;
		LocalDate dt_transacao = LocalDate.now();
		float vl_transacao = 777;
		String ds_transacao = "teste";
		Transacao transacao = new Transacao(0, id_login, id_categoria, dt_transacao, vl_transacao, ds_transacao);
		loginDAO.cadastrar(transacao);
		System.out.println("CADASTRADO");
		//String email = "marcopolo@gmail.com";
		//Main.buscar(loginDAO, email);
		//System.out.println(loginDAO.validar(login));
		//Main.inserirLogin(loginDAO, login);
		//Main.validar(loginDAO, login);
	}
	
	public static void buscar (OracleLoginDAO dao, String email) {
		Login login = dao.buscar(email);
		System.out.println(login.getId_login());
		System.out.println(login.getNm_login());
		System.out.println(login.getDs_email());
		System.out.println(login.getDs_senha());
		System.out.println(login.getDt_criacao());
		System.out.println(login.getVl_saldo());
	}
	
	public static void validar (OracleLoginDAO dao, Login login) {
		
		dao.validar(login);
	}
	public static void inserirLogin(OracleLoginDAO dao, Login login) {

		login.setNm_login("Marco");
		login.setDs_email("marcopolo@gmail.com");
		login.setDs_senha("marcopolo");
		login.setVl_saldo(1000);
		login.setDt_criacao(LocalDate.now());

		//dao.cadastrar(login);
	}
}
