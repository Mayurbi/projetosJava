package br.com.fiap.model.heranca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(new Veiculo("FFO - 0987", 2010));
		veiculos.add(new Veiculo("GHO - 7855", 2012));
		veiculos.add(new Veiculo("OAS - 0455", 2014));
		veiculos.add(new Veiculo("FFO - 0987", 2010));
		veiculos.add(new Caminhao("FFO - 0987", 2014, 5));
		veiculos.add(new Caminhao("FFO - 0987", 2000, 5));
		
		ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
		veiculos.add(new Veiculo("FFO - 0987", 2010));
		veiculos.add(new Caminhao("FFO - 0987", 2000, 5));
		
		for (Veiculo veiculo: veiculos) {
			veiculo.exibirDados();
			
		}
		
		for (Caminhao caminhao : caminhoes) {
			caminhao.exibirDados();
		}
	}

}
