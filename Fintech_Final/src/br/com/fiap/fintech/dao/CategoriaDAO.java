package br.com.fiap.fintech.dao;

import java.util.List;

import br.com.fiap.fintech.bean.Categoria;
import br.com.fiap.fintech.exception.DBException;

public interface CategoriaDAO {

	void cadastrar(Categoria categoria) throws DBException;
	void atualizar(Categoria categoria) throws DBException;
	void remover(int id_categoria) throws DBException;
	Categoria buscar(int id_categoria);
	List<Categoria> listar();
	
}
