package br.com.melhorescompras.model;

public class Profissional extends Usuario {
	private String login;
	private String senha;
	private String cpf;
	private String emailContato;
	private ProfissionalEnum tipo;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmailContato() {
		return emailContato;
	}

	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}

	public ProfissionalEnum getTipo() {
		return tipo;
	}

	public void setTipo(ProfissionalEnum tipo) {
		this.tipo = tipo;
	}

	public void enviarVideo() {
	
	}
}