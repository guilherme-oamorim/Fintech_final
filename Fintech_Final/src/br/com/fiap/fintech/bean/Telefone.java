package br.com.fiap.fintech.bean;

public class Telefone {
	private int id_telefone;
	private int id_login;
	private String nr_ddd;
	private String nr_telefone;

	public Telefone() {
	}

	public Telefone(int id_telefone, int id_login, String nr_ddd, String nr_telefone) {
		this.id_telefone = id_telefone;
		this.id_login = id_login;
		this.nr_ddd = nr_ddd;
		this.nr_telefone = nr_telefone;
	}

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public int getId_login() {
		return id_login;
	}

	public void setId_login(int id_login) {
		this.id_login = id_login;
	}

	public String getNr_ddd() {
		return nr_ddd;
	}

	public void setNr_ddd(String nr_ddd) {
		this.nr_ddd = nr_ddd;
	}

	public String getNr_telefone() {
		return nr_telefone;
	}

	public void setNr_telefone(String nr_telefone) {
		this.nr_telefone = nr_telefone;
	}

}