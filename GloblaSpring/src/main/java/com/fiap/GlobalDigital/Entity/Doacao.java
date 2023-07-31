package com.fiap.GlobalDigital.Entity;

import java.math.BigDecimal;

import com.fiap.GlobalDigital.Dto.DadosAtualizacaoDoacao;
import com.fiap.GlobalDigital.Dto.DadosCadastroDoacao;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "doacao")
@Entity(name = "Doacoes")
public class Doacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private BigDecimal preco;
	
	@Enumerated(EnumType.STRING)
	private EnumFormaPagamento formaPagamento;
	
	private Usuario doador;

	@Embedded
	private Organizacao organizacao;
	private Boolean ativo;

//Construtores
	public Doacao() {

	}

	public Doacao(DadosCadastroDoacao dados) {
		this.ativo = true;
		this.preco = dados.preco();
		this.formaPagamento = dados.formaPagamento();
		this.doador = dados.doador();
		this.organizacao = new Organizacao(dados.organizacao());
	}

	public void atualizarInformacoes(DadosAtualizacaoDoacao dados) {
		if (dados.preco() != null) {
			this.preco = dados.preco();
		}
		if (dados.formaPagamento() != null) {
			this.formaPagamento = dados.formaPagamento();
		}
		if (dados.doador() != null) {
			this.doador = dados.doador();
		}
		if (dados.organizacao() != null) {
			this.organizacao.atualizarInformacoes(dados.organizacao());
		}
	}

	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public EnumFormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(EnumFormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Usuario getDoador() {
		return doador;
	}

	public void setDoador(Usuario doador) {
		this.doador = doador;
	}

	public Organizacao getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
