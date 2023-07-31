package br.com.fiap.CatalogoJogos.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import br.com.fiap.CatalogoJogos.requisitos.Requisitos;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Table(name = "jogos")
@Entity(name = "Jogos")
public class Jogos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo, desenvolvedora, distribuidora, idiomas, nJogadores, lancamento;

	@Enumerated(EnumType.STRING)
	private Genero genero;

	@Embedded
	private Requisitos requisitosSistemas;
	private Boolean ativo;

	public Jogos(DadosCadastroJogos dados) {
		super();
		this.ativo = true;
		this.titulo = dados.titulo();
		this.desenvolvedora = dados.desenvolvedora();
		this.distribuidora = dados.distribuidora();
		this.idiomas = dados.idiomas();
		this.nJogadores = dados.nJogadores();
		this.lancamento = dados.lancamento();
		this.genero = dados.genero();
		this.requisitosSistemas = new Requisitos(dados.requisitosSistemas());
	}
		public void atualizaInformacoes(DadosAtualizacaoJogos dados) {
			if (dados.titulo() != null) {
				this.titulo = dados.titulo();
			}
			if (dados.titulo() != null) {
				this.titulo = dados.titulo();
			}
			if (dados.desenvolvedora() != null) {
				this.desenvolvedora = dados.desenvolvedora();
			}
			if (dados.distribuidora() != null) {
				this.distribuidora = dados.distribuidora();
			}
			if (dados.idiomas() != null) {
				this.idiomas = dados.idiomas();
			}
			if (dados.nJogadores() != null) {
				this.nJogadores = dados.nJogadores();
			}
			if (dados.lancamento() != null) {
				this.lancamento = dados.lancamento();
			}
			if (dados.genero() != null) {
				this.genero = dados.genero();
			}
			if (dados.dadosRequisitosSistemas() != null) {
				this.requisitosSistemas.atualizaInformacoes(dados.dadosRequisitosSistemas());
			}
		}
		public void excluir() {
			this.ativo = false;
		}

	public Jogos() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getnJogadores() {
		return nJogadores;
	}

	public void setnJogadores(String nJogadores) {
		this.nJogadores = nJogadores;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Requisitos getRequisitosSistemas() {
		return requisitosSistemas;
	}

	public void setRequisitosSistemas(Requisitos requisitosSistemas) {
		this.requisitosSistemas = requisitosSistemas;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

}
