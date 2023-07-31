package br.com.melhorescompras.model;

public class Cliente extends Usuario {
	private String login;
	private String senha;
	private String endereco;
	private String cpf;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cliente() {

	}

	public Cliente(int id, String nome, String login, String senha, String endereco, String cpf) {
		super();
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
		this.cpf = cpf;
	}
}
