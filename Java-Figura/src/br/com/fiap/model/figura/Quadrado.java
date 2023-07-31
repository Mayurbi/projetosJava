package br.com.fiap.model.figura;

public class Quadrado extends Retangulo {

	public Quadrado() {
		super();
	}
	
	public Quadrado(String cor, double lado1, double lado2) {
		super(lado1, lado2, cor);
	}
	public Quadrado(String cor, double lado) {
		lado = super.getLado1();
	}
	@Override
	public double area() {
		return this.getLado1() * this.getLado1();
	}
	@Override
	public String toString() {
		return "Quadrado [area()= " + area() + ",cor= " + super.getCor() + "]";
	}
}
