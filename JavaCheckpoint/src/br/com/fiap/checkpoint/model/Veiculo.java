package br.com.fiap.checkpoint.model;

import java.util.List;

public class Veiculo {
	private String anoFab, modelo, montadora;
	private int valor;
	private List<Acessorio> listAcess;

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public List<Acessorio> getListAcess() {
		return listAcess;
	}

	public void setListAcess(List<Acessorio> listAcess) {
		this.listAcess = listAcess;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	public Veiculo() {

	}

	public Veiculo(String anoFab, String modelo, String montadora, List<Acessorio> listAcess, int valor) {
		this.anoFab = anoFab;
		this.listAcess = listAcess;
		this.modelo = modelo;
		this.montadora = montadora;
		this.valor = valor;
}
}
