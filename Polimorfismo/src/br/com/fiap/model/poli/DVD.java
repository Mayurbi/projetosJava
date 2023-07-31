package br.com.fiap.model.poli;

import java.util.Scanner;

public class DVD extends Midia{
	
	private int nFaixas;
	//Privates
	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	//Construtor
	public DVD() {
		
	}
	//Construtor com parametros
	public DVD(int codigo, double preco, String nome) {
		super(codigo, preco, nome);// Chamada ao construtor da classe Midia
		setnFaixas(nFaixas); 
	}
	
	 //Fun��o para impressao do tipo.
	 public String getTipo(){
		 return "DVD: ";
		 }
	 // Fun��o que retorna o conte�do do campos desta
	 // classe e da classe Midia (usando super !).
	 
	 public String getDetalhes(){ 
		 return super.getDetalhes() + "\n" + "Numero de faixas: " + nFaixas + "\n"; 
		}

	 public void setFaixas(int nfaix){ 
		 nFaixas = (nfaix > 0) ? nfaix:0;
		 }

	 // Fun��o para leitura dos dados via teclado dos
	 // campos desta classe e dos campos da classe
	 // Midia (usando super !).
	 public void inserirDados(){
	 // Leitura dos dados contidos nos campos
	 // pertencentes a classe Midia.
	 super.inserirDados();

	 Scanner in = new Scanner(System.in);

	 // Leitura dos dados do teclado.
	 System.out.printf("\n Entre com o numero de faixas: ");
	 int nfaix = in.nextInt();

	 // Enviando os dados lidos para as funcoes set.
	 setFaixas(nfaix);
	 }
}
