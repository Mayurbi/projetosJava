package br.com.fiap.model.figura;

public class Triangulo extends Figura{
	
	private double base, altura;
//Private
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
//Construtor vazio
	public Triangulo () {	
	}
	
//Construtor 
	public Triangulo(double base, double altura, String cor) {
		super(cor);
		this.altura = altura;
		this.base = base;
	}
	
	@Override
	public double area() {
		return base * altura;
	}
	
	@Override
	public String toString() {
		return "Triangulo [base= " + base + ", altura= " + altura + ", cor= " + super.getCor() + "]";
	}
}