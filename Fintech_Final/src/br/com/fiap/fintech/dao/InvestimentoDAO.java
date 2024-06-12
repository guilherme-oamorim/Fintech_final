package br.com.fiap.fintech.dao;

import java.util.List;
import br.com.fiap.fintech.bean.Investimento;
import br.com.fiap.fintech.exception.DBException;

public interface InvestimentoDAO {
	
	void cadastrar(Investimento investimento) throws DBException;
	void atualizar(Investimento investimento) throws DBException;
	void remover(int id_invest) throws DBException;
	Investimento buscar(int id_invest);
	List<Investimento> listar(int id_login);
	
}