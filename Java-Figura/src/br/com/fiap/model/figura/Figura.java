package br.com.fiap.model.figura;

public abstract class Figura {
	
//Classe especial que n�o pode ser instanciada, apenas herdada.
	
	private String cor;
	
	public Figura() {
		
	}
	
	public Figura(String cor) {
		super();
		this.cor = cor;
	}
	
	//Privates
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
//O modificador override � necess�rio para estender ou modificar a implementa��o abstrata ou virtual de um m�todo, propriedade, indexador ou evento herdado.
	
	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]"; 
	}
	
	public abstract double area();
}