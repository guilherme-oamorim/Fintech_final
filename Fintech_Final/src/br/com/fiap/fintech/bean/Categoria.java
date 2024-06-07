package br.com.fiap.fintech.bean;

import java.time.LocalDate;

public class Categoria {
    private int id_categoria;
    private String nm_categoria;
    private LocalDate dt_criacao;
    private String ds_categoria;
    
	public Categoria() {
	}
	
	public Categoria(int id_categoria, String nm_categoria, LocalDate dt_criacao, String ds_categoria) {
		this.id_categoria = id_categoria;
		this.nm_categoria = nm_categoria;
		this.dt_criacao = dt_criacao;
		this.ds_categoria = ds_categoria;
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
	
	public LocalDate getDt_criacao() {
		return dt_criacao;
	}
	
	public void setDt_criacao(LocalDate dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	
	public String getDs_categoria() {
		return ds_categoria;
	}
	
	public void setDs_categoria(String ds_categoria) {
		this.ds_categoria = ds_categoria;
	}
}