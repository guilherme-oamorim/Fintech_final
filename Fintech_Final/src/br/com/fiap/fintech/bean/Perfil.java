package br.com.fiap.fintech.bean;

import java.time.LocalDate;

public class Perfil {

	private int id_perfil;
	private int id_login;
	private String nm_perfil;
	private String ds_senha;
	private double vl_saldo;
	private LocalDate dt_criacao;

	public Perfil() {
		super();
	}

	public Perfil(int id_perfil, int id_login, String nm_perfil, String ds_senha, double vl_saldo,
			LocalDate dt_criacao) {
		super();
		this.id_perfil = id_perfil;
		this.id_login = id_login;
		this.nm_perfil = nm_perfil;
		this.ds_senha = ds_senha;
		this.vl_saldo = vl_saldo;
		this.dt_criacao = dt_criacao;
	}

	public int getId_perfil() {
		return id_perfil;
	}

	public void setId_perfil(int id_perfil) {
		this.id_perfil = id_perfil;
	}

	public int getId_login() {
		return id_login;
	}

	public void setId_login(int id_login) {
		this.id_login = id_login;
	}

	public String getNm_perfil() {
		return nm_perfil;
	}

	public void setNm_perfil(String nm_perfil) {
		this.nm_perfil = nm_perfil;
	}

	public String getDs_senha() {
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}

	public double getVl_saldo() {
		return vl_saldo;
	}

	public void setVl_saldo(double vl_saldo) {
		this.vl_saldo = vl_saldo;
	}

	public LocalDate getDt_criacao() {
		return dt_criacao;
	}

	public void setDt_criacao(LocalDate dt_criacao) {
		this.dt_criacao = dt_criacao;
	}

}