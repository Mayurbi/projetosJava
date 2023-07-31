package br.com.fiap.model.figura;

public class Circulo extends Figura {
	private double raio;
//private
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
//Construtor
	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
	}
	
	public Circulo() {
		
	}
	
	@Override
	public double area() {
		return raio * 3.14 * 2;
	}
	@Override
	public String toString() {
		return "Circulo [raio= " + raio + ",cor= " + super.getCor() + "]";
	}
}
