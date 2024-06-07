package br.com.fiap.fintech.bean;

import java.time.LocalDate;

public class Investimento {

	private int id_invest;
	private int id_perfil;
	private String nm_invest;
	private float vl_invest;
	private LocalDate dt_invest;
	private String ds_invest;
	private LocalDate dt_conclusao;

	public Investimento() {
	}

	public Investimento(int id_invest, int id_perfil, String nm_invest, float vl_invest, LocalDate dt_invest,
			String ds_invest, LocalDate dt_conclusao) {
		super();
		this.id_invest = id_invest;
		this.id_perfil = id_perfil;
		this.nm_invest = nm_invest;
		this.vl_invest = vl_invest;
		this.dt_invest = dt_invest;
		this.ds_invest = ds_invest;
		this.dt_conclusao = dt_conclusao;
	}

	public int getId_invest() {
		return id_invest;
	}

	public void setId_invest(int id_invest) {
		this.id_invest = id_invest;
	}

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public String getNm_invest() {
		return nm_invest;
	}

	public void setNm_invest(String nm_invest) {
		this.nm_invest = nm_invest;
	}

	public float getVl_invest() {
		return vl_invest;
	}

	public void setVl_invest(float vl_invest) {
		this.vl_invest = vl_invest;
	}

	public LocalDate getDt_invest() {
		return dt_invest;
	}

	public void setDt_invest(LocalDate dt_invest) {
		this.dt_invest = dt_invest;
	}

	public String getDs_invest() {
		return ds_invest;
	}

	public void setDs_invest(String ds_invest) {
		this.ds_invest = ds_invest;
	}

	public LocalDate getDt_conclusao() {
		return dt_conclusao;
	}

	public void setDt_conclusao(LocalDate dt_conclusao) {
		this.dt_conclusao = dt_conclusao;
	}
}