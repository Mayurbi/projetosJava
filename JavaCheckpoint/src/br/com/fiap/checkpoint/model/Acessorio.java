package br.com.fiap.checkpoint.model;

public class Acessorio {
	private String descricao;
	private int valor;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public Acessorio() {

	}

	public Acessorio(String descricao, int valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
}
