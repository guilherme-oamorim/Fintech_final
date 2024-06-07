package br.com.fiap.fintech.bean;

import java.time.LocalDate;

public class Login {
	private int id_login;
	private String nm_login;
	private String ds_email;
	private String ds_senha;
	private LocalDate dt_criacao;

	public Login() {
	}

	public Login(int id_login, String nm_login, String ds_email, String ds_senha, LocalDate dt_criacao) {
		this.id_login = id_login;
		this.nm_login = nm_login;
		this.ds_email = ds_email;
		this.ds_senha = ds_senha;
		this.dt_criacao = dt_criacao;
	}

	public int getId_login() {
		return id_login;
	}

	public void setId_login(int id_login) {
		this.id_login = id_login;
	}

	public String getNm_login() {
		return nm_login;
	}

	public void setNm_login(String nm_login) {
		this.nm_login = nm_login;
	}

	public String getDs_email() {
		return ds_email;
	}

	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}

	public String getDs_senha() {
		return ds_senha;
	}

	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}

	public LocalDate getDt_criacao() {
		return dt_criacao;
	}

	public void setDt_criacao(LocalDate dt_criacao) {
		this.dt_criacao = dt_criacao;
	}

}