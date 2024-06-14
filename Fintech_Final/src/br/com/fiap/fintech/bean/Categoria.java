package br.com.fiap.fintech.bean;

import java.time.LocalDate;

public class Categoria {
    private int id_categoria;
    private String nm_categoria;
    
	public Categoria() {
	}
	
	public Categoria(int id_categoria, String nm_categoria) {
		this.id_categoria = id_categoria;
		this.nm_categoria = nm_categoria;

	}
	
	public int getId_categoria() {
		return id_categoria;
	}
	
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	public String getNm_categoria() {
		return nm_categoria;
	}
	
	public void setNm_categoria(String nm_categoria) {
		this.nm_categoria = nm_categoria;
	}
}