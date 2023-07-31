package br.com.fiap.entity;

import java.util.InputMismatchException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
	private long id_usu;
	private String nome_usu;
	private String email;
	protected String cpf_usu;
	protected int telefone_usu;
	private String senha;

//getters and setters

	public long getId_usu() {
		return id_usu;
	}

	public void setId_usu(long id_usu) {
		this.id_usu = id_usu;
	}

	public String getNome_usu() {
		return nome_usu;
	}

	public void setNome_usu(String nome_usu) {
		this.nome_usu = nome_usu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf_usu() {
		return cpf_usu;
	}

	public void setCpf_usu(String cpf_usu) {
		this.cpf_usu = cpf_usu;
	}

	public int getTelefone_usu() {
		return telefone_usu;
	}

	public void setTelefone_usu(int telefone_usu) {
		this.telefone_usu = telefone_usu;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//construtor vazio
	public Usuario() {

	}

//construtor
	public Usuario(long id_usu, String nome_usu, String email, String cpf_usu, int telefone_usu, String senha) {
		this.id_usu = id_usu;
		this.nome_usu = nome_usu;
		this.email = email;
		this.cpf_usu = cpf_usu;
		this.telefone_usu = telefone_usu;
		this.senha = senha;
	}

//vincular comentario usuario
	public void vincularComentario(Comentario comentario) {
		System.out.println("Comentario vinculado para" + this.getNome_usu());

	}

	// validar cpf usuario
	public static boolean isCPF(String CPF) {

		if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222")
				|| CPF.equals("33333333333") || CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777") || CPF.equals("88888888888")
				|| CPF.equals("99999999999") || (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		try {

			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {

				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48);

			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (CPF.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	public static String imprimeCPF(String CPF) {
		return (CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." + CPF.substring(6, 9) + "-"
				+ CPF.substring(9, 11));
	}

	public void buscarViagem() {
		// adicionarei a devida logica
	}

	public void contatar() {
		// adicionarei a devida logica
	}

}
