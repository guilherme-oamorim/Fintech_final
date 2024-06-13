package br.com.fiap.fintech.dao;

import br.com.fiap.fintech.bean.Login;
import br.com.fiap.fintech.exception.DBException;

public interface LoginDAO {

	void cadastrar(Login login) throws DBException;
	void atualizar(Login login) throws DBException;
	boolean validar(String email, String senha) throws DBException;
	// void remover(int id_login) throws DBException;
	Login buscar(int id_login);
	// List<Login> listar();
	
}