package dominio;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", length = 6, nullable = false)
	private Long id;

	@Column(name = "nome_usuario", length = 70, nullable = false)
	private String nome;

	@Column(name = "email_usuario", length = 80, nullable = false)
	private String email;

	@Column(name = "senha_usuario", length = 20, nullable = false)
	private String senha;

	@Column(name = "cpf_usuario", length = 11, nullable = false)
	private double cpf;

	@Column(name = "telefone_usuario", length = 13, nullable = false)
	private double telefone;

	@Column(name = "data_cadastro", nullable = true)
	private LocalDate dataCadastro;

//Construtores
	public Usuario() {

	}

	public Usuario(Long id, String nome, String email, String senha, double cpf, double telefone,
			LocalDate dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
	}

//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

//hash e equals	
	@Override
	public int hashCode() {
		return Objects.hash(cpf, dataCadastro, email, id, nome, senha, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Double.doubleToLongBits(cpf) == Double.doubleToLongBits(other.cpf)
				&& Objects.equals(dataCadastro, other.dataCadastro) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha)
				&& Double.doubleToLongBits(telefone) == Double.doubleToLongBits(other.telefone);
	}

//toString

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf
				+ ", telefone=" + telefone + ", dataCadastro=" + dataCadastro + "]";
	}
}