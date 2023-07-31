package br.com.fiap_viagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {
	private Connection conexao = null;

	public Connection obterConexao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//banco utilizado: conexão:porta, usuário, senha
			conexao = DriverManager.getConnection("jdbc:Oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM93298", "080903");

			//Retornando a conexão
			return conexao;

		} catch(SQLException erro) {
			erro.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

		return null;
	}	
}
