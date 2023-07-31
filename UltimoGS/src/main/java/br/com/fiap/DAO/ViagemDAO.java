package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import br.com.fiap.entity.Viagem;
import br.com.fiap.enuns.eventosEnum;
import br.com.fiap.enuns.statusViagemEnum;

public class ViagemDAO {
	private Connection conexao = null;

	public ViagemDAO() {
		this.conexao = GerenciadorBD.obterConexao();
	}

	public void cadastrar(Viagem viagem) throws ParseException {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"insert into viagem (id_viagem,cep,pontos_interesse,ponto_saida,ponto_chegada,horario,valor,eventos,statusviagem, motorista_id_mot) values(?,?,?,?,?,?,?,?,?,?)");
			comandoSQL.setLong(1, viagem.getId_viagem());
			comandoSQL.setString(2, viagem.getCep());
			comandoSQL.setString(3, viagem.getPonto_interesse());
			comandoSQL.setString(4, viagem.getPonto_saida());
			comandoSQL.setString(5, viagem.getPonto_chegada());
			comandoSQL.setDate(6, new Date(0));
			comandoSQL.setDouble(7, viagem.getValor());
			comandoSQL.setString(8, viagem.getEventos().toString());
			comandoSQL.setString(9, viagem.getStatusViagem().toString());
			comandoSQL.setLong(10, 78621);
			comandoSQL.executeUpdate();
			
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Viagem buscarPorId(Long id) {
		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from viagem where  id_viagem = ?");
			comandoSQL.setLong(1, id);
			ResultSet rs = comandoSQL.executeQuery();	
			if (rs.next()) {
				Viagem viagem = new Viagem();
				viagem.setId_viagem(rs.getInt(1));
				viagem.setCep(rs.getString(2));
				viagem.setPonto_interesse(rs.getString(3));
				viagem.setPonto_saida(rs.getString(4));
				viagem.setPonto_chegada(rs.getString(5));
				viagem.setHorario(rs.getString(6));
				viagem.setValor(rs.getInt(7));
				return viagem;

			}
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Viagem> buscarTudo() {

		ArrayList<Viagem> listaViagem = new ArrayList<Viagem>();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from viagem order by id_viagem");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Viagem viagem = new Viagem();
				viagem.setId_viagem(rs.getInt(1));
				viagem.setCep(rs.getString(2));
				viagem.setPonto_interesse(rs.getString(3));
				viagem.setPonto_saida(rs.getString(4));
				viagem.setPonto_chegada(rs.getString(5));
				viagem.setHorario(rs.getString(6));
				viagem.setValor(rs.getInt(7));

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

	public void alterar(Viagem viagem) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("update viagem set cep = ?, ponto_interesse = ? where id_viagem = ?");
			comandoSQL.setString(1, viagem.getCep());
			comandoSQL.setString(2, viagem.getPonto_interesse());
			comandoSQL.setLong(3, viagem.getId_viagem());

			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void excluir(Long id) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("delete from viagem where id_viagem = ?");
			comandoSQL.setLong(1, id);

			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
