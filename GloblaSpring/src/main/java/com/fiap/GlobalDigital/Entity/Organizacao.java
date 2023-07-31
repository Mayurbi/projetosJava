package com.fiap.GlobalDigital.Entity;

import com.fiap.GlobalDigital.Dto.DadosOrganizacao;
import jakarta.persistence.Embeddable;

@Embeddable
public class Organizacao {
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	private String senha;
	private String descricao;

//Construtores
	public Organizacao() {

	}

	public Organizacao(DadosOrganizacao dados) {
		this.nome = dados.nome();
		this.cnpj = dados.cnpj();
		this.telefone = dados.telefone();
		this.email = dados.email();
		this.senha = dados.senha();
		this.descricao = dados.descricao();
	}

	public void atualizarInformacoes(DadosOrganizacao dados) {
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.cnpj() != null) {
			this.cnpj = dados.cnpj();
		}
		if (dados.telefone() != null) {
			this.telefone = dados.telefone();
		}
		if (dados.email() != null) {
			this.email = dados.email();
		}
		if (dados.senha() != null) {
			this.senha = dados.senha();
		}
		if (dados.descricao() != null) {
			this.descricao = dados.descricao();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
