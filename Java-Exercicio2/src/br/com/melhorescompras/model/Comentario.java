package br.com.melhorescompras.model;

public class Comentario {
	private int id;
	private String comentario, data;
	private Cliente usario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getUsario() {
		return usario;
	}

	public void setUsario(Cliente usario) {
		this.usario = usario;
	}

}
