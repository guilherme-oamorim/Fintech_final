package br.com.fiap.fintech.teste;


import java.util.List;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.bean.Perfil;
import br.com.fiap.fintech.bean.Telefone;
import br.com.fiap.fintech.bean.Transacao;
import br.com.fiap.fintech.dao.CategoriaDAO;
import br.com.fiap.fintech.dao.InvestimentoDAO;
import br.com.fiap.fintech.dao.LoginDAO;
import br.com.fiap.fintech.dao.PerfilDAO;
import br.com.fiap.fintech.dao.TelefoneDAO;
import br.com.fiap.fintech.dao.TransacaoDAO;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LoginDAO dao = new LoginDAO();
		Login login = new Login();

		Main.inserirLogin(dao, login);
		Main.imprimirLogin(dao, login);

		CategoriaDAO catDao = new CategoriaDAO();
		Categoria categoria = new Categoria();

		Main.inserirCategoria(catDao, categoria);
		Main.imprimirCategoria(catDao, categoria);

		PerfilDAO perfilDao = new PerfilDAO();
		Perfil perfil = new Perfil();

		Main.inserirPerfil(perfilDao, perfil);
		Main.imprimirPerfil(perfilDao, perfil);

		InvestimentoDAO investDao = new InvestimentoDAO();
		Investimento invest = new Investimento();

		Main.inserirInvestimento(investDao, invest);
		Main.imprimirInvestimento(investDao, invest);

		TransacaoDAO transacaoDao = new TransacaoDAO();
		Transacao transacao = new Transacao();

		Main.inserirTransacao(transacaoDao, transacao);
		Main.imprimirTransacao(transacaoDao, transacao);

		TelefoneDAO telefoneDao = new TelefoneDAO();
		Telefone telefone = new Telefone();

		Main.inserirTelefone(telefoneDao, telefone);
		Main.imprimirTelefone(telefoneDao, telefone);
	}

	private static void imprimirTransacao(TransacaoDAO transacaoDao, Transacao transacao) {
		List<Transacao> lista = transacaoDao.ListarTodos();
		for (Transacao item : lista) {
			System.out.println("ID_TRANSACAO: " + item.getId_transacao() + " ; ID_PERFIL: " + item.getId_perfil()
					+ " ; ID_CATEGORIA: " + item.getId_categoria() + " ; DATA_TRANSACAO: " + item.getDt_transacao()
					+ " ; VALOR_TRANSACAO: " + item.getVl_transacao() + " ; DESCRIÇÃO_TRANSACAO: "
					+ item.getDs_transacao());
		}

		System.out.println("Cadastrado!");
	}

	private static void inserirTransacao(TransacaoDAO transacaoDao, Transacao transacao) {

		transacao.setId_perfil(1);
		transacao.setId_categoria(1);
		transacao.setDt_transacao(LocalDate.now());
		transacao.setVl_transacao(20.50f);
		transacao.setDs_transacao("Academia");

		transacaoDao.Cadastrar(transacao);
	}

	private static void imprimirPerfil(PerfilDAO perfilDao, Perfil perfil) {
		
		List<Perfil> lista = perfilDao.listarTodos();
		
		for (Perfil item : lista) {
			System.out.println("ID_PERFIL: " + item.getId_perfil() + " ; ID_LOGIN: " + item.getId_login() + " ; NOME: "
					+ item.getNm_perfil() + " ; SENHA: " + item.getDs_senha() + " ; SALDO: " + item.getVl_saldo()
					+ " ; DATA_CRIAÇAO: " + item.getDt_criacao());
		}

		System.out.println("Cadastrado!");

	}

	private static void inserirPerfil(PerfilDAO perfilDao, Perfil perfil) {
		perfil.setId_login(1);
		perfil.setNm_perfil("Lucas");
		perfil.setDs_senha("marcopolo");
		perfil.setVl_saldo(20.50);
		perfil.setDt_criacao(LocalDate.now());

		perfilDao.Cadastrar(perfil);
	}

	public static void imprimirLogin(LoginDAO dao, Login login) {

		List<Login> lista = dao.listarTodos();
		for (Login item : lista) {
			System.out.println("ID_LOGIN: " + item.getId_login() + " ; NOME: " + item.getNm_login() + 
					" ; E-MAIL: " + item.getDs_email() + " ; SENHA: " + item.getDs_senha()
					+ " ; DATA_CRIAÇÃO: " + item.getDt_criacao());
		}

		System.out.println("Cadastrado!");
	}

	public static void inserirLogin(LoginDAO dao, Login login) {

		login.setNm_login("Marco");
		login.setDs_email("marcopolo@gmail.com");
		login.setDs_senha("marcopolo");
		login.setDt_criacao(LocalDate.now());

		dao.Cadastrar(login);
	}

	public static void imprimirCategoria(CategoriaDAO dao, Categoria categoria) {

		List<Categoria> lista = dao.listarTodos();
		for (Categoria item : lista) {
			System.out.println("ID_CATEGORIA: " + item.getId_categoria() + " ; NOME: " + item.getNm_categoria() + 
					" ; DATA_CRIAÇÃO: "	+ item.getDt_criacao() + " ; DESCRIÇÃO: " + item.getDs_categoria());
		}

		System.out.println("Cadastrado!");
	}

	public static void inserirCategoria(CategoriaDAO dao, Categoria categoria) {

		categoria.setNm_categoria("Alimentação");
		categoria.setDt_criacao(LocalDate.now());
		categoria.setDs_categoria("alimente-se");

		dao.Cadastrar(categoria);
	}

	public static void imprimirInvestimento(InvestimentoDAO dao, Investimento investimento) {

		List<Investimento> lista = dao.listarTodos();
		for (Investimento item : lista) {
			System.out.println("ID_INVESTIMENTO: " + item.getId_invest() + " ; ID_PERFIL: " + item.getId_perfil()
					+ " ; NOME_INVESTIMENTO: " + item.getNm_invest() + " ; VALOR: " + item.getVl_invest() + 
					" ; DATA: "	+ item.getDt_invest() + " ; DESCRIÇÃO: " + item.getDs_invest() + 
					" ; DATA_CONCLUSAO: " + item.getDt_conclusao());
		}

		System.out.println("Cadastrado!");
	}

	public static void inserirInvestimento(InvestimentoDAO dao, Investimento investimento) {

		investimento.setId_perfil(1);
		investimento.setNm_invest("CDI");
		investimento.setVl_invest(2000.50f);
		investimento.setDt_invest(LocalDate.now());
		investimento.setDs_invest("JUROS");
		investimento.setDt_conclusao(LocalDate.parse("2025-05-22"));

		dao.Cadastrar(investimento);
	}

	public static void imprimirTelefone(TelefoneDAO dao, Telefone telefone) {

		List<Telefone> lista = dao.listarTodos();
		for (Telefone item : lista) {
			System.out.println("ID_TELEFONE: " + item.getId_telefone() + " ; ID_LOGIN: " + item.getId_login()
					+ " ; DDD: " + item.getNr_ddd() + " ; NÚMERO: " + item.getNr_telefone());
		}

		System.out.println("Cadastrado!");
	}

	public static void inserirTelefone(TelefoneDAO dao, Telefone telefone) {

		telefone.setId_login(1);
		telefone.setNr_ddd("11");
		telefone.setNr_telefone("912345678");

		dao.Cadastrar(telefone);
	}
}
