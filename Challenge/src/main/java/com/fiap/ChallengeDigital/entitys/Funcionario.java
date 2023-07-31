package com.fiap.ChallengeDigital.entitys;

import com.fiap.ChallengeDigital.dto.DadosAtualizacaoFuncionario;
import com.fiap.ChallengeDigital.dto.DadosCadastroFuncionario;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Table(name = "funcionario")
@Entity(name = "Funcionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome, cargo, iniciou_em, saiu_em, observacoes, salario, banco_horas;

	@Enumerated(EnumType.STRING)
	private ContratacaoEnum contratacao;

	@Enumerated(EnumType.STRING)
	private SenioridadeEnum senioridade;

	private String equipe_id;
	private Boolean ativo;

	@Embedded
	private Usuario usuario;

	public Funcionario(DadosCadastroFuncionario dados) {
		super();
		this.ativo = true;
		this.nome = dados.nome();
		this.cargo = dados.cargo();
		this.iniciou_em = dados.iniciou_em();
		this.saiu_em = dados.saiu_em();
		this.observacoes = dados.observacoes();
		this.salario = dados.salario();
		this.banco_horas = dados.banco_horas();
		this.contratacao = dados.contratacao();
		this.senioridade = dados.senioridade();
		this.equipe_id = dados.equipe_id();
		this.usuario = new Usuario(dados.usuario());
	}

	public Funcionario() {

	}

	public void atualizaInformacoes(DadosAtualizacaoFuncionario dados) {
		if (dados.id() != null) {
			this.id = dados.id();
		}
		if (dados.nome() != null) {
			this.nome = dados.nome();
		}
		if (dados.cargo() != null) {
			this.cargo = dados.cargo();
		}
		if (dados.iniciou_em() != null) {
			this.iniciou_em = dados.iniciou_em();
		}
		if (dados.saiu_em() != null) {
			this.saiu_em = dados.saiu_em();
		}
		if (dados.observacoes() != null) {
			this.observacoes = dados.observacoes();
		}
		if (dados.salario() != null) {
			this.salario = dados.salario();
		}
		if (dados.banco_horas() != null) {
			this.banco_horas = dados.banco_horas();
		}
		
		if (dados.contratacao() != null) {
			this.contratacao = dados.contratacao();
		}
		if (dados.senioridade() != null) {
			this.senioridade = dados.senioridade();
		}

		if (dados.equipe_id() != null) {
			this.equipe_id = dados.equipe_id();
		}
		if (dados.usuario() != null) {
			this.usuario.atualizaInformacoes(dados.usuario());
		}

	}

	public void excluir() {
		this.ativo = false;
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getIniciou_em() {
		return iniciou_em;
	}

	public void setIniciou_em(String iniciou_em) {
		this.iniciou_em = iniciou_em;
	}

	public String getSaiu_em() {
		return saiu_em;
	}

	public void setSaiu_em(String saiu_em) {
		this.saiu_em = saiu_em;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public ContratacaoEnum getContratacao() {
		return contratacao;
	}

	public void setContratacao(ContratacaoEnum contratacao) {
		this.contratacao = contratacao;
	}

	public SenioridadeEnum getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(SenioridadeEnum senioridade) {
		this.senioridade = senioridade;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getBanco_horas() {
		return banco_horas;
	}

	public void setBancoHoras(String banco_horas) {
		this.banco_horas = banco_horas;
	}

	public String getEquipe_id() {
		return equipe_id;
	}

	public void setEquipe_id(String equipe_id) {
		this.equipe_id = equipe_id;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
