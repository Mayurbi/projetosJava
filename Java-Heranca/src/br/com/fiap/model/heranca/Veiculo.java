package br.com.fiap.model.heranca;

public class Veiculo {
	private String placa;
	private int ano;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Veiculo() {

	}

	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}

	public void exibirDados() {
		System.out.println("A placa do carro é " + placa + "e o ano de fabricação é " + ano);
	}
}
