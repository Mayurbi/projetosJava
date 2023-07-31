package br.com.fiap.entity;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.enuns.tipoVeiculoEnum;

@XmlRootElement
public class Veiculo {
	private long id_veiculo;
	private String renavam;
	private tipoVeiculoEnum tipoVeiculo;
	private String placa;

	// getters and setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public Long getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public tipoVeiculoEnum getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(tipoVeiculoEnum tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	// Construtores
	public Veiculo() {

	}

	public Veiculo(Integer id, String renavam, tipoVeiculoEnum tipo, String placa) {
		this.id_veiculo = id;
		this.renavam = renavam;
		this.tipoVeiculo = tipo;
		this.placa = placa;
	}

// usuario poder cadastrar o tipo veiculo
	public tipoVeiculoEnum cadastrarVeiculo(tipoVeiculoEnum veiculo, Motorista titular) {

		System.out.println("Cnh");
		for (tipoVeiculoEnum carro : tipoVeiculoEnum.values()) {
			System.out.printf("Voc� escolheu a op��o ", (carro));
		}

		for (tipoVeiculoEnum moto : tipoVeiculoEnum.values()) {
			System.out.printf("Voc� escolheu a op��o ", (moto));
		}
		return veiculo;
	}

	// validar renavam documento do carro
	public boolean validarRenavam(String renavam) {

		if (renavam.matches("^([0-9]{9})$")) {
			renavam = "00" + renavam;
		}

		if (!renavam.matches("[0-9]{11}")) {
			return false;
		}

		String renavamSemDigito = renavam.substring(0, 10);

		String renavamReversoSemDigito = new StringBuffer(renavamSemDigito).reverse().toString();

		int soma = 0;

		for (int i = 0; i < 8; i++) {
			Integer algarismo = Integer.parseInt(renavamReversoSemDigito.substring(i, i + 1));
			Integer multiplicador = i + 2;
			soma += algarismo * multiplicador;
		}

		soma += Character.getNumericValue(renavamReversoSemDigito.charAt(8)) * 2;
		soma += Character.getNumericValue(renavamReversoSemDigito.charAt(9)) * 3;

		int mod11 = soma % 11;

		int ultimoDigitoCalculado = 11 - mod11;

		ultimoDigitoCalculado = (ultimoDigitoCalculado >= 10 ? 0 : ultimoDigitoCalculado);

		int digitoRealInformado = Integer.valueOf(renavam.substring(renavam.length() - 1, renavam.length()));

		if (ultimoDigitoCalculado == digitoRealInformado) {
			return true;
		}
		return false;
	}
}
