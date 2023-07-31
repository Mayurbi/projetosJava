package br.com.fiap.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comentario {
	String comentario;
	private Usuario usuario;
	private Motorista motorista;
	
//getters and setters
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	//construtores
	public Comentario() {
		
	}
	public Comentario(String comentario,Usuario usuario,Motorista motorista) {
		this.comentario = comentario;
		this.motorista = motorista;
		this.usuario = usuario;
	}
//metodos registrar comentario pra usuario e motorista
	public void registrarComentario(Usuario usuario, String comentario) {
		this.usuario = usuario;
		this.comentario = comentario;

		usuario.vincularComentario(this);
	}
	public void registrarComentario(Motorista motorista, String comentario) {
		this.motorista = motorista;
		this.comentario = comentario;

		motorista.vincularComentario(this);
	}
/// metodo pegarComentario
	public String pegarComentario() {
		return this.comentario;
	}

}
