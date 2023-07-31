package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long rg;
	
	private String nome;
	private String endereco;
	private String telefone;
	@Column(name = "data_nasc")
	private LocalDate dtNascimento;
	private String profissao;
	private String email;

	// Construtores
	public Paciente() {

	}

	public Paciente(String nome, Long rg, String endereco, String telefone, LocalDate dtNascimento,
			String profissao, String email) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dtNascimento = dtNascimento;
		this.profissao = profissao;
		this.email = email;
	}

	// getter and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", rg=" + rg + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dtNascimento=" + dtNascimento + ", profissao=" + profissao + ", email=" + email + "]";
	}

}
