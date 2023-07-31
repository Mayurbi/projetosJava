package br.com.fiap_viagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.fiap_viagens.entity.Gasto;


public class GastoDAO {
	
	private Connection conexao = null;

	public GastoDAO() {
		this.conexao = new GerenciadorBD().obterConexao();
	}

	public void inserir(Gasto gasto)  
	{
		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"insert into tbl_gasto (id_gasto,descricao,local,categoria,valor,data,id_viagem) values(?,?,?,?,?,?,?)");
			comandoSQL.setLong(1, gasto.getId());
			comandoSQL.setString(2, gasto.getDescricao());
			comandoSQL.setString(3, gasto.getLocal());
			//comandoSQL.set(4, gasto.getCategoria());
			comandoSQL.setDouble(5, gasto.getValor());
		   //comandoSQL.setDate(6, gasto.getData());
			comandoSQL.setInt(7, gasto.getViagem().getId());
			
		

			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Gasto buscarPorId(int id){
		Gasto gasto = new Gasto();
		
		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from tbl_gasto where  id_gasto = ?");
			comandoSQL.setInt(1, id);
			ResultSet rs = comandoSQL.executeQuery();
			if (rs.next()) {
				gasto.getId();
				
			}
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gasto;
	}
	
	public ArrayList<Gasto> listAll(){
		ArrayList<Gasto> listaGasto = new ArrayList<Gasto>();
		
		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from tbl_gasto order by id_gasto");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Gasto gasto = new Gasto();
				gasto.setId(rs.getLong(1));
				

				listaGasto.add(gasto);
			}
			conexao.close();
			comandoSQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
		return listaGasto;

	}
}