package dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LivroId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "titulo", length = 60, nullable = false)
	private String titulo;

	@Column(name = "isbn", length = 13, nullable = false)
	private String isbn;

	public LivroId() {

	}

	// getters and setters
	public LivroId(String titulo, String isbn) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
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

	// to string
	@Override
	public String toString() {
		return "LivroId [titulo=" + titulo + ", isbn=" + isbn + "]";
	}

	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(isbn, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroId other = (LivroId) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(titulo, other.titulo);
	}
}
