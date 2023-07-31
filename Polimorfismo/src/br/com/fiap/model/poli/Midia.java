package br.com.fiap.model.poli;

import java.util.Scanner;

public class Midia {
//o principal conceito do polimorfismo é a propriedade de duas ou mais classes derivadas (Macaco, Homem e Baleia) de uma mesma superclasse (Mamifero) responderem a mesma mensagem (locomoverSe()), cada uma de uma forma diferente (pulando de galho em galho, andando e nadando, respectivamente)
	
	private int codigo;
	private double preco;
	private String nome;
	//Privates
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Construtor vazio.
	public Midia() {
		
	}
	//Construtor com parametros.
	public Midia(int codigo,double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}
	
	// Função para impressao dos dados do tipo.
	public String getTipo() {
		return "Midia: ";
	}
	
	//Função que retorna o conteúdo do campos em forma de String.
	public String getDetalhes() {
		return "Codigo: " + getCodigo() + "\n" + "Preco: " + getPreco() + "\n" + "Nome: " + getNome() + "\n";
	}
	
	// Função para impressao dos dados via getDetalhes().
	public void printDados() {
		String s = getTipo() + "\n" + getDetalhes() + "\n";
		 System.out.println(s);
	}
	
	// Função para leitura dos dados via teclado.
	public void inserirDados() {
		
		Scanner in = new Scanner(System.in);

		 // Leitura dos dados do teclado.
		 System.out.printf("\n Entre com o codigo: ");
		 int cod = in.nextInt();
		 System.out.printf("\n Entre com o preco: ");
		 double pre = in.nextDouble();
		 in.nextLine(); // Leitura do enter.
		 System.out.printf("\n Entre com o nome: ");
		 String nom = in.nextLine();

		 // Enviando os dados lidos para as funcoes set.
		 setCodigo(cod);
		 setPreco(pre);
		 setNome(nom);
	}
}
