package br.com.fiap_viagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.fiap_viagens.entity.Viagem;

public class ViagemDAO {

	private Connection conexao = null;

	public ViagemDAO() {
		this.conexao = new GerenciadorBD().obterConexao();
	}

	public void inserir(Viagem viagem) {
		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"insert into tbl_gasto (id_viagem,destino,dt_chegada,dt_saida,vlr_orcamento,qtd_pessoas) values(?,?,?,?,?,?,?)");
			comandoSQL.setLong(1, viagem.getId());
			comandoSQL.setString(2, viagem.getDestino());
			comandoSQL.setDate(3, viagem.getDataChegada());
			comandoSQL.setDate(4, viagem.getDataSaida());
			comandoSQL.setDouble(5, viagem.getValorOrcamento());
			comandoSQL.setString(6, viagem.getTipoViagem());
			comandoSQL.setInt(6, viagem.getQuantidadePessoas());

			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Viagem buscarPorId(int id) {
		Viagem viagem = new Viagem();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from tbl_viagem where  id_viagem = ?");
			comandoSQL.setInt(1, id);
			ResultSet rs = comandoSQL.executeQuery();
			if (rs.next()) {
				viagem.getId();

			}
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return viagem;
	}

	public ArrayList<Viagem> listAll() {
		ArrayList<Viagem> listaViagem = new ArrayList<Viagem>();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from tbl_viagem order by id_viagem");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Viagem viagem = new Viagem();
				viagem.setId(rs.getInt(1));

				listaViagem.add(viagem);
			}
			conexao.close();
			comandoSQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return listaViagem;

	}
}