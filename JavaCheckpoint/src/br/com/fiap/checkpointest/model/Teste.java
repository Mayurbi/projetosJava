package br.com.fiap.checkpointest.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import br.com.fiap.checkpoint.model.Acessorio;
import br.com.fiap.checkpoint.model.Veiculo;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		//instancias 
		Acessorio acessorio = new Acessorio();
		Veiculo veic = new Veiculo();
		Teste tet = new Teste();

		Scanner sc = new Scanner(System.in);
		//listas
		List<Acessorio> acess = new ArrayList<Acessorio>();
		acess.add(new Acessorio());
		acess.add(new Acessorio());
		acess.add(new Acessorio());

		List<Veiculo> veic2 = new ArrayList<Veiculo>();
		veic2.add(new Veiculo());
		veic2.add(new Veiculo());
		veic2.add(new Veiculo());
		veic2.add(new Veiculo());
		veic2.add(new Veiculo());
		
// execption 
		try {
			int op = 1;
			for (Veiculo veiculo : veic2) {
				System.out.println("*------Cadastro de Ve�culo------*");
				System.out.println("Digite o modelo do veiculo: ");
				veiculo.setModelo(sc.next());
				System.out.println("Digite o ano do fabricacao: ");
				veiculo.setAnoFab(sc.next());
				System.out.println("Digite a montadora: ");
				veiculo.setMontadora(sc.next());
				System.out.println("Digite o valor:  ");
				veiculo.setValor(sc.nextInt());
				int cont = 0;
				while(cont<3) {
				System.out.println("Gostaria de cadastrar o acess�rio;\n Digite [1] para sim ou [2] para n�o");
				// coloquei op para perfumar o c�digo
				op = sc.nextInt();		
					
				if (op == 1) {
					System.out.println("*-----Cadastro de acess�rio-----*");
					System.out.println("Digite a descri��o do acessorio:   ");
					acessorio.setDescricao(sc.next());
					System.out.println("Digite o valor do acessorio:       ");
					acessorio.setValor(sc.nextInt());
					TimeUnit.SECONDS.sleep(1);
					cont++;
				} else {
					System.out.println("Finalizando cadastro");
					TimeUnit.SECONDS.sleep(1);
					cont=3;
					}
				}
				veiculo.setListAcess(acess);
			
				
		}
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inv�lido.\n");
				return ;
		}
		
		System.out.println("A quantidade de ve�culos:  \n" + tet.quantidadeVeiculos(veic2));
		System.out.println("A m�dia de ve�culos �:   \n" + tet.mediaVeiculos(veic2, tet.quantidadeVeiculos(veic2)));
		System.out.println("A quantidade de acess�rios �:    \n" + tet.totalAcessorio(veic2));
		System.out.println("O ve�culo mais caro �:   \n" + tet.maisCaro(veic2));
	}

	public double quantidadeVeiculos(List<Veiculo> veiculo) {
		double total = 0;
		for (int i = 0; i < veiculo.size(); i++) {
			total = total + veiculo.get(i).getValor();
		}
		return  total;

	}

	public double mediaVeiculos(List<Veiculo> veiculo, double total) {
		double media = ( total / veiculo.size()); 
		return media;

	}

	public int totalAcessorio(List<Veiculo> veic2) {
		int quantidade = 0;
		for (int i = 0; i <veic2.size(); i++) {
		quantidade = veic2.get(i).getListAcess().size();
		}
		return quantidade;
	}

	public double maisCaro(List<Veiculo> veiculo) {	
		double maior = 0;
		for (int i = 0; i <veiculo.size(); i++) {
			if (veiculo.get(i).getValor()>maior) {
				maior = veiculo.get(i).getValor();
			}
		}
		return  maior;
		}
	}
