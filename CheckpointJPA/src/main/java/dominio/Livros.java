package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "livros")
public class Livros implements Serializable {

	private static final long serialVersionUID = 1L;

//	@EmbeddedId
//	private LivroId id;

	// fiz chave composta classe embutida mas estava dando erro de session factory 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "titulo", length = 60, nullable = false)
	private String titulo;

	@Column(name = "isbn", length = 13, nullable = false)
	private String isbn;

	@Column(name = "sinopse", nullable = false)
	@Lob
	private String sinopse;

	@Column(name = "data_publicacao", length = 13, nullable = false)
	private LocalDate dataPublicacao;

	@Column(name = "preco", length = 13, nullable = false)
	private BigDecimal preco;

	@Column(name = "genero", nullable = false)
	@Enumerated(EnumType.STRING)
	private Genero genero;

	// @Embedded
	// private Editora editora;

	// construtores
	public Livros() {

	}

	public Livros(Long id, String titulo, String isbn, String sinopse, LocalDate dataPublicacao, Genero genero,
			BigDecimal preco) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.sinopse = sinopse;
		this.dataPublicacao = dataPublicacao;
		this.genero = genero;
		this.preco = preco;
		// this.editora = editora;
	}

	// getters and setter chave composta
//	public LivroId getId() {
//		return id;
//	}
//
//	public void setId(LivroId id) {
//		this.id = id;
//	}

	// getters and setters

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Editora getEditora() {
//		return editora;
//	}
//
//	public void setEditora(Editora editora) {
//		this.editora = editora;
//	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(dataPublicacao, genero, id, preco, sinopse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(dataPublicacao, other.dataPublicacao) && genero == other.genero
				&& Objects.equals(id, other.id) && Objects.equals(preco, other.preco)
				&& Objects.equals(sinopse, other.sinopse);
	}

	// to string
	@Override
	public String toString() {
		return "Livros [id=" + id + ", sinopse=" + sinopse + ", dataPublicacao="
				+ dataPublicacao + ", preco=" + preco + ", genero=" + genero + "]";
	}

}
