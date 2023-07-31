package br.com.melhorescompras.model;

public class Celulares extends Detalhe {
	private int preco;
	private int gigabyte;
	private String marca;

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getGigabyte() {
		return gigabyte;
	}

	public void setGigabyte(int gigabyte) {
		this.gigabyte = gigabyte;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
