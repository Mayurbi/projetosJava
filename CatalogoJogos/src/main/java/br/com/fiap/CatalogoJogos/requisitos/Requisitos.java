package br.com.fiap.CatalogoJogos.requisitos;

import jakarta.persistence.Embeddable;

@Embeddable
public class Requisitos {
	private String sistemaOperacional;
	private String processador;
	private String memoria;
	private String placaVideo;
	private String armazenamento;

	public Requisitos(DadosRequisitos dados) {
		this.sistemaOperacional = dados.sistemaOperacional();
		this.processador = dados.processador();
		this.memoria = dados.memoria();
		this.placaVideo = dados.placaVideo();
		this.armazenamento = dados.armazenamento();
	}

	public void atualizaInformacoes(DadosRequisitos dados) {
		if (dados.sistemaOperacional() != null) {
			this.sistemaOperacional = dados.sistemaOperacional();
		}
		if (dados.processador() != null) {
			this.processador = dados.processador();
		}
		if (dados.memoria() != null) {
			this.memoria = dados.memoria();
		}
		if (dados.placaVideo() != null) {
			this.placaVideo = dados.placaVideo();
		}
		if (dados.armazenamento() != null) {
			this.armazenamento = dados.armazenamento();
		}
	}

	// constructor
	public Requisitos() {

	}

	// getters and setters
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

}
