package dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Editora implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;

	@Column(name = "nome_editora", length = 30, nullable = false)
	private String nome;

	@Column(name = "telefone", length = 15, nullable = false)
	private String telefone;

	@Column(name = "razao_social", length = 60, nullable = false)
	private String razaoSocial;

	@Column(name = "endereco", length = 60, nullable = false)
	private String endereco;


	// Construtores
	public Editora() {

	}

	public Editora(Long id, String nome, String telefone, String razaoSocial, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
	}

	// getters and setters
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(endereco, id, nome, razaoSocial, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editora other = (Editora) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(razaoSocial, other.razaoSocial)
				&& Objects.equals(telefone, other.telefone);
	}

	// toString
	@Override
	public String toString() {
		return "Editora [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", razaoSocial=" + razaoSocial
				+ ", endereco=" + endereco + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
