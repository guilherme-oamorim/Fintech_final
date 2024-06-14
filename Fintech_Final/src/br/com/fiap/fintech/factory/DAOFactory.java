package br.com.fiap.fintech.factory;

import br.com.fiap.fintech.dao.impl.OracleTransacaoDAO;
import br.com.fiap.fintech.dao.InvestimentoDAO;
import br.com.fiap.fintech.dao.impl.OracleInvestimentoDAO;
import br.com.fiap.fintech.dao.impl.OracleLoginDAO;
import br.com.fiap.fintech.dao.CategoriaDAO;
import br.com.fiap.fintech.dao.impl.OracleCategoriaDAO;

public class DAOFactory {

	public static OracleTransacaoDAO getTransacaoDAO() {
		return new OracleTransacaoDAO();
	}
	
	public static OracleInvestimentoDAO getInvestimentoDAO() {
		return new OracleInvestimentoDAO();
	}
	
	public static OracleLoginDAO getLoginDAO() {
		return new OracleLoginDAO();
	}
	
	public static OracleCategoriaDAO getCategoriaDAO() {
		return new OracleCategoriaDAO();
	}
	
}