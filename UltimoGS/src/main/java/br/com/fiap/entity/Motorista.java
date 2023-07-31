package br.com.fiap.entity;

import java.util.InputMismatchException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Motorista {
	private long id_mot;
	private String nome_mot;
	private String email;
	protected String cpf_mot;
	protected String cnh;
	protected long telefone_mot;
	private String senha;
	private int idade;

//getters and setters
	public long getId_mot() {
		return id_mot;
	}

	public void setId_mot(long id_mot) {
		this.id_mot = id_mot;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getNome_mot() {
		return nome_mot;
	}

	public void setNome_mot(String nome_mot) {
		this.nome_mot = nome_mot;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf_mot() {
		return cpf_mot;
	}

	public void setCpf_mot(String cpf_mot) {
		this.cpf_mot = cpf_mot;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh_mot(String cnh) {
		this.cnh = cnh;
	}

	public long getTelefone_mot() {
		return telefone_mot;
	}

	public void setTelefone_mot(long telefone_mot) {
		this.telefone_mot = telefone_mot;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// construtores
	public Motorista() {

	}

	public Motorista(long id_mot, String nome_mot, String email, String cpf_mot, String cnh, long telefone_mot,
			String senha, int idade) {
		this.setId_mot(id_mot);
		this.nome_mot = nome_mot;
		this.email = email;
		this.cpf_mot = cpf_mot;
		this.cnh = cnh;
		this.telefone_mot = telefone_mot;
		this.senha = senha;
		this.idade = idade;

	}

//metodo vincular comentario
	public void vincularComentario(Comentario comentario) {
		System.out.println("Comentario vinculado para" + this.getNome_mot());

	}

//validar cnh
	public static boolean validaCNH(String cnh) {
		char char1 = cnh.charAt(0);

		if (cnh.replaceAll("\\D+", "").length() != 11
				|| String.format("%0" + 11 + "d", 0).replace('0', char1).equals(cnh)) {
			return false;
		}

		long v = 0, j = 9;

		for (int i = 0; i < 9; ++i, --j) {
			v += ((cnh.charAt(i) - 48) * j);
		}

		long dsc = 0, vl1 = v % 11;

		if (vl1 >= 10) {
			vl1 = 0;
			dsc = 2;
		}

		v = 0;
		j = 1;

		for (int i = 0; i < 9; ++i, ++j) {
			v += ((cnh.charAt(i) - 48) * j);
		}

		long x = v % 11;
		long vl2 = (x >= 10) ? 0 : x - dsc;

		return (String.valueOf(vl1) + String.valueOf(vl2)).equals(cnh.substring(cnh.length() - 2));

	}

	public static void main(String[] args) {
		System.out.println(validaCNH("07021871297"));
	}

	// validar cpf
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

	public void iniciarViagem() {
		// adicionar a devida logica
	}

	public void aceitarViagem() {
		// adicionar a devida logica
	}

}
