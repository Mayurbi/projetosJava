package dominio;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class IdConta implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rg;
	private String cpf;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public IdConta() {

	}

	public IdConta(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "IdConta [rg=" + rg + ", cpf=" + cpf + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, rg);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdConta other = (IdConta) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(rg, other.rg);
	}

}
