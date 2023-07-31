package dominio;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {
	private String nomePizzaria;
	private SaboresEnum sabores;
	private TamanhoEnum tamanhos;
	private String acompanhamentos;
	private Endereco endereco;
	private String telefone;
	private int preco;

	public Pizza() {

	}

	public Pizza(String nomePizzaria, SaboresEnum sabores, TamanhoEnum tamanhos, String acompanhamentos,
			Endereco endereco, String telefone, int preco) {
		super();
		this.nomePizzaria = nomePizzaria;
		this.sabores = sabores;
		this.tamanhos = tamanhos;
		this.acompanhamentos = acompanhamentos;
		this.endereco = endereco;
		this.telefone = telefone;
		this.preco = preco;
	}

	public String getNomePizzaria() {
		return nomePizzaria;
	}

	public void setNomePizzaria(String nomePizzaria) {
		this.nomePizzaria = nomePizzaria;
	}

	public SaboresEnum getSabores() {
		return sabores;
	}

	public void setSabores(SaboresEnum sabores) {
		this.sabores = sabores;
	}

	public TamanhoEnum getTamanhos() {
		return tamanhos;
	}

	public void setTamanhos(TamanhoEnum tamanhos) {
		this.tamanhos = tamanhos;
	}

	public String getAcompanhamentos() {
		return acompanhamentos;
	}

	public void setAcompanhamentos(String acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acompanhamentos == null) ? 0 : acompanhamentos.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nomePizzaria == null) ? 0 : nomePizzaria.hashCode());
		result = prime * result + preco;
		result = prime * result + ((sabores == null) ? 0 : sabores.hashCode());
		result = prime * result + ((tamanhos == null) ? 0 : tamanhos.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		if (acompanhamentos == null) {
			if (other.acompanhamentos != null)
				return false;
		} else if (!acompanhamentos.equals(other.acompanhamentos))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nomePizzaria == null) {
			if (other.nomePizzaria != null)
				return false;
		} else if (!nomePizzaria.equals(other.nomePizzaria))
			return false;
		if (preco != other.preco)
			return false;
		if (sabores != other.sabores)
			return false;
		if (tamanhos != other.tamanhos)
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pizza [nomePizzaria=" + nomePizzaria + ", sabores=" + sabores + ", tamanhos=" + tamanhos
				+ ", acompanhamentos=" + acompanhamentos + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", preco=" + preco + "]";
	}

}
