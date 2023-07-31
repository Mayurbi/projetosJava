package br.com.fiap.entity;

import java.util.Objects;

import br.com.fiap.enuns.Genero;
import br.com.fiap.records.DadosAtualizacaoCatalogo;
import br.com.fiap.records.DadosCadastroCatalogo;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Paola Mendes Bernardes RM93298, José Vitor Brasilino da Silva RM95438
@Table(name = "catalogo")
@Entity(name = "Filmes")
public class CatalogoFilmes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String atorprincipal;
	private String duracao;
	private String anolancamento;
	private String paisorigem;

	@Enumerated(EnumType.STRING)
	private Genero genero;
	@Embedded
	private FichaTecnica fichatecnica;
	

	public void atualizarInformocoes(DadosAtualizacaoCatalogo dados) {
		if (dados.titulo() != null) {
			this.titulo = dados.titulo();
		}
		if (dados.atorprincipal() != null) {
			this.atorprincipal = dados.atorprincipal();
		}
		if (dados.duracao() != null) {
			this.duracao = dados.duracao();

		}
		if (dados.anolancamento() != null) {
			this.anolancamento = dados.anolancamento();
		}
		if (dados.paisorigem() != null) {
			this.paisorigem = dados.paisorigem();
		}
		if (dados.genero() != null) {
			this.genero = dados.genero();
		}
		if (dados.fichatecnica() != null) {
			this.fichatecnica = dados.fichatecnica();
		}
	}

	// construtor vazio
	public CatalogoFilmes() {

	}

	// construto com passagem de parametro
	public CatalogoFilmes(DadosCadastroCatalogo dados) {
		this.titulo = dados.titulo();
		this.atorprincipal = dados.atorprincipal();
		this.duracao = dados.duracao();
		this.anolancamento = dados.anolancamento();
		this.paisorigem = dados.paisorigem();
		this.genero = dados.genero();
		this.fichatecnica = new FichaTecnica(dados.fichatecnica());
	}

	// getters and setters
	public String getTitulo() {
		return titulo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAtorprincipal() {
		return atorprincipal;
	}

	public void setAtorprincipal(String atorprincipal) {
		this.atorprincipal = atorprincipal;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getAnolancamento() {
		return anolancamento;
	}

	public void setAnolancamento(String anolancamento) {
		this.anolancamento = anolancamento;
	}

	public String getPaisorigem() {
		return paisorigem;
	}

	public void setPaisorigem(String paisorigem) {
		this.paisorigem = paisorigem;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public FichaTecnica getFichatecnica() {
		return fichatecnica;
	}

	public void setFichatecnica(FichaTecnica fichatecnica) {
		this.fichatecnica = fichatecnica;
	}

	

	// metodo to string
	@Override
	public String toString() {
		return "CatalogoFilmes [id=" + id + ", titulo=" + titulo + ", atorprincipal=" + atorprincipal + ", duracao="
				+ duracao + ", anolancamento=" + anolancamento + ", paisorigem=" + paisorigem + ", genero=" + genero
				+ ", fichatecnica=" + fichatecnica + "]";
	}
	// hash e equals
	@Override
	public int hashCode() {
		return Objects.hash(anolancamento, atorprincipal, duracao, fichatecnica, genero, id, paisorigem, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatalogoFilmes other = (CatalogoFilmes) obj;
		return Objects.equals(anolancamento, other.anolancamento) && Objects.equals(atorprincipal, other.atorprincipal)
				&& Objects.equals(duracao, other.duracao) && Objects.equals(fichatecnica, other.fichatecnica)
				&& genero == other.genero && Objects.equals(id, other.id)
				&& Objects.equals(paisorigem, other.paisorigem) && Objects.equals(titulo, other.titulo);
	}
}