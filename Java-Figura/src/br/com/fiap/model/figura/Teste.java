package br.com.fiap.model.figura;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para finalizar, vamos criar uma classe chamado Teste para criarmos os objetos de todas as classes que criamos e ver o resultado
		//Instanciar 
		Quadrado quadrado = new Quadrado();
		Triangulo triangulo = new Triangulo(5,12,"Azul");
		Circulo circulo = new Circulo(10.2,"Verde");
		Retangulo retangulo = new Retangulo(32,12,"Rosa");
		
		quadrado.setCor("Roxo");
		quadrado.setLado1(4);
		
		System.out.println(quadrado);
		System.out.println(triangulo);
		System.out.println(circulo);
		System.out.println(retangulo);
		
		}
}
