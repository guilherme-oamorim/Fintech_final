package br.com.fiap.fintech;

import java.time.LocalDate;

public class Transacao {
	private int id_transacao;
	private int id_perfil;
	private int id_categoria;
	private LocalDate dt_transacao;
	private float vl_transacao;
	private String ds_transacao;

	public Transacao() {
	}

	public Transacao(int id_transacao, int id_perfil, int id_categoria, LocalDate dt_transacao, float vl_transacao,
			String ds_transacao) {
		super();
		this.id_transacao = id_transacao;
		this.id_perfil = id_perfil;
		this.id_categoria = id_categoria;
		this.dt_transacao = dt_transacao;
		this.vl_transacao = vl_transacao;
		this.ds_transacao = ds_transacao;
	}

	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public LocalDate getDt_transacao() {
		return dt_transacao;
	}

	public void setDt_transacao(LocalDate dt_transacao) {
		this.dt_transacao = dt_transacao;
	}

	public float getVl_transacao() {
		return vl_transacao;
	}

	public void setVl_transacao(float vl_transacao) {
		this.vl_transacao = vl_transacao;
	}

	public String getDs_transacao() {
		return ds_transacao;
	}

	public void setDs_transacao(String ds_transacao) {
		this.ds_transacao = ds_transacao;
	}

}