package br.com.fiap.fintech.factory;

import br.com.fiap.fintech.dao.TransacaoDAO;
import br.com.fiap.fintech.dao.impl.OracleTransacaoDAO;
import br.com.fiap.fintech.dao.InvestimentoDAO;
import br.com.fiap.fintech.dao.impl.OracleInvestimentoDAO;
import br.com.fiap.fintech.dao.LoginDAO;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.dao.CategoriaDAO;
import br.com.fiap.fintech.dao.impl.OracleCategoriaDAO;

public class DAOFactory {

	public static TransacaoDAO getTransacaoDAO() {
		return new OracleTransacaoDAO();
	}
	
	public static InvestimentoDAO getInvestimentoDAO() {
		return new OracleInvestimentoDAO();
	}
	
	public static LoginDAO getLoginDAO() {
		return new OracleLoginDAO();
	}
	
	public static CategoriaDAO getCategoriaDAO() {
		return new OracleCategoriaDAO();
	}
	
}