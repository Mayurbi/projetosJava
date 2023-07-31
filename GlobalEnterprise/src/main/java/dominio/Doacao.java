package dominio;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "doacao")
public class Doacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_doacao", length = 8, nullable = false)
	private Long id;

	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal preco;

	@Column(name = "forma_pagamento", length = 60, nullable = false)
	private EnumFormaPagamento formaPagamento;

	@Embedded
	private Organizacao organizacao;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

//Construtores
	public Doacao() {
		super();

	}

	public Doacao(Long id, BigDecimal preco, EnumFormaPagamento formaPagamento, Organizacao organizacao,
			Usuario usuario) {
		this.id = id;
		this.preco = preco;
		this.formaPagamento = formaPagamento;
		this.organizacao = organizacao;
		this.usuario = usuario;
	}

//getters and setters
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

	public Organizacao getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

//hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(usuario, formaPagamento, id, organizacao, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doacao other = (Doacao) obj;
		return Objects.equals(usuario, other.usuario) && formaPagamento == other.formaPagamento
				&& Objects.equals(id, other.id) && Objects.equals(organizacao, other.organizacao)
				&& Objects.equals(preco, other.preco);
	}

//toString
	@Override
	public String toString() {
		return "Doacao [id=" + id + ", preco=" + preco + ", formaPagamento=" + formaPagamento + ", organizacao="
				+ organizacao + ", doador=" + usuario + "]";
	}
}
