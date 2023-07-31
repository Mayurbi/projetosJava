package dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Embeddable
public class Organizacao implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;

	@Column(name = "nome_organizacao", length = 70, nullable = false)
	private String nome;

	@Column(name = "cnpj_organizacao", length = 14, nullable = false)
	private double cnpj;

	@Column(name = "telefone_organizacao", length = 13, nullable = false)
	private double telefone;

	@Column(name = "email_usuario", length = 80, nullable = false)
	private String email;

	@Column(name = "senha_usuario", length = 30, nullable = false)
	private String senha;

	@Column(name = "descricao_organizacao", length = 500, nullable = false)
	@Lob
	private String descricao;

//Construtores
	public Organizacao() {
		super();

	}

	public Organizacao(Long id, String nome, double cnpj, double telefone, String email, String senha,
			String descricao) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.descricao = descricao;
	}

//getters and setters
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

	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
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

// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, descricao, email, id, nome, senha, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizacao other = (Organizacao) obj;
		return Double.doubleToLongBits(cnpj) == Double.doubleToLongBits(other.cnpj)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha)
				&& Double.doubleToLongBits(telefone) == Double.doubleToLongBits(other.telefone);
	}

//toString
	@Override
	public String toString() {
		return "Organizacao [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", telefone=" + telefone + ", email="
				+ email + ", senha=" + senha + ", descricao=" + descricao + "]";
	}
}