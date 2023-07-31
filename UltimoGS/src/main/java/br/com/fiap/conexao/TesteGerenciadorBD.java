package br.com.fiap.conexao;

import br.com.fiap.DAO.GerenciadorBD;

public class TesteGerenciadorBD {
	public static void main(String[] args) {
		if (GerenciadorBD.obterConexao() == null) {
			System.out.println("Erro ao estabelecer a conexão");
		} else {
			System.out.println("Conexão estabelecida com sucesso");
		}

	}
}
