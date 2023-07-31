package br.com.fiap.model.heranca;

public class Caminhao extends Veiculo {
	private int eixos;

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	public Caminhao() {

	}

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public void exibirDados() {
		System.out.println("A placa do caminh�o � " + getPlaca() + "e o ano de fabrica��o � " + getAno()
				+ "e o seu eixo � " + eixos);
	}
}
