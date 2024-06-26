package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.exception.DBException;

public interface LoginDAO {

	void cadastrar(Login login) throws DBException;
	void atualizar(Login login) throws DBException;
	boolean validar(Login login);
	// void remover(int id_login) throws DBException;
	Login buscar(String email);
	// List<Login> listar();
	
}