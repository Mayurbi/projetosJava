package br.com.fiap_viagens.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorBD {
	private Connection conexao = null;

	public Connection obterConexao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//banco utilizado: conex�o:porta, usu�rio, senha
			conexao = DriverManager.getConnection("jdbc:Oracle:thin:@oracle.fiap.com.br:1521:orcl", "RM93298", "080903");

			//Retornando a conex�o
			return conexao;

		} catch(SQLException erro) {
			erro.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

		return null;
	}	
}
