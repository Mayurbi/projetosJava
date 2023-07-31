package dominio;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
public class Conta {
	@EmbeddedId
	private IdConta id;
	private String nome;
	private int idade;
	private String email;
	private String nroConta;
	private double saldo;

	public IdConta getId() {
		return id;
	}

	public void setId(IdConta id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNroConta() {
		return nroConta;
	}

	public void setNroConta(String nroConta) {
		this.nroConta = nroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {

	}

	public Conta(IdConta id, String nome, int idade, String email, String nroConta, double saldo) {
		super();
		this.id = id;
		this.email = email;
		this.idade = idade;
		this.email = email;
		this.nroConta = nroConta;
		this.saldo = saldo;
	}

	public void sacar() {

	}

	public void depositar() {

	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", nroConta=" + nroConta
				+ ", saldo=" + saldo + "]";
	}

}
