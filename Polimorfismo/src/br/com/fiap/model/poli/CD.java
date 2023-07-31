package br.com.fiap.model.poli;

import java.util.Scanner;

public class CD extends Midia{
	private int nMusicas;

	 // Construtor sem par�metros.
	 public CD(){ 
		 this(0,0.0,"Nenhum",0); // Chamada ao construtor com param.
	}

	 // Construtor com par�metros.
	 public CD(int codigo, double preco, String nome, int nMusicas) {
	 // Chamada ao construtor da classe Midia.
	  super(codigo, preco, nome);
	 setMusica(nMusicas);
	 }

	 //Fun��o para impressao do tipo.
	 public String getTipo()
	 { return "CD: "; }
	// Fun��o que retorna o conte�do do campos desta
	 // classe e da classe Midia (usando super !).
	 public String getDetalhes(){ 
		 return super.getDetalhes() + "\n" + "Numero de musicas: " + nMusicas + "\n";
	 }

	 public void setMusica(int nmus){ 
		 nMusicas = (nmus > 0) ? nmus : 0; 
	 }

	 // Fun��o para leitura dos dados via teclado dos
	 // campos desta classe e dos campos da classe
	 // Midia (usando super !).
	 public void inserirDados() { 
	// Leitura dos dados contidos nos campos pertencentes a classeMidia
		 super.inserirDados();

	 Scanner in = new Scanner(System.in);
	 // Leitura dos dados do teclado.
	 System.out.printf("\n Entre com o numero de musicas: ");
	 int nmus = in.nextInt();

	 // Enviando os dados lidos para as funcoes set.
	 setMusica(nmus); 
	 }
}
