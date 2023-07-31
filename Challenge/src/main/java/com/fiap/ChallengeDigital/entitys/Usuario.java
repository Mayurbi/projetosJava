package com.fiap.ChallengeDigital.entitys;

import com.fiap.ChallengeDigital.dto.DadosUsuario;

import jakarta.persistence.Embeddable;

@Embeddable
public class Usuario {
	private String id_usuario;
	private String email, senha;
	private String estatistica;
	private String empresa;

	public Usuario(DadosUsuario dados) {
		this.id_usuario = dados.id_usuario();
		this.email = dados.email();
		this.senha = dados.senha();
		this.estatistica = dados.estatistica();
		this.empresa = dados.empresa();
	}

	public Usuario() {

	}

	public void atualizaInformacoes(DadosUsuario dados) {
		if (dados.id_usuario() != null) {
			this.id_usuario = dados.id_usuario();
		}
		if (dados.email() != null) {
			this.email = dados.email();
		}
		if (dados.senha() != null) {
			this.senha = dados.senha();
		}
		if (dados.estatistica() != null) {
			this.estatistica = dados.estatistica();
		}
		if (dados.empresa() != null) {
			this.empresa = dados.empresa();
		}
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstatistica() {
		return estatistica;
	}

	public void setEstatistica(String estatistica) {
		this.estatistica = estatistica;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
