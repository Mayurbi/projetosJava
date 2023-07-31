package br.com.fiap.model.heranca;

public class Onibus extends Veiculo {
	private int assentos;

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	@Override
	public void exibirDados() {
		System.out.println("A placa do Ônibus é " + getPlaca() + "e o ano de fabricação é " + getAno()
				+ "e o seu números de assentos é " + assentos);
	}
}
