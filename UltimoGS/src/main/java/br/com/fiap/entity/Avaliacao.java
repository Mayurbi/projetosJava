package br.com.fiap.entity;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.enuns.estrelasEnum;

@XmlRootElement
public class Avaliacao extends Viagem {
	private Comentario comentario;
	private estrelasEnum avaliacao;

//getters and setters 
	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public estrelasEnum getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(estrelasEnum avaliacao) {
		this.avaliacao = avaliacao;
	}

//construtores
	public Avaliacao() {

	}

	public Avaliacao(Comentario comentario, estrelasEnum avaliacao) {
		super();
		this.comentario = comentario;
		this.avaliacao = avaliacao;
	}

// metodo registrar comentario
	public void registrarComentario() {
		this.setComentario(comentario);
	}
}
