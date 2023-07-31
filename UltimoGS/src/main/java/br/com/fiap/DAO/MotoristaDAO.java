package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.entity.Motorista;

@XmlRootElement
public class MotoristaDAO {
	private Connection conexao = null;

	public MotoristaDAO() {
		this.conexao = GerenciadorBD.obterConexao();
	}

	public void cadastrar(Motorista motorista) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"insert into motorista (id_mot,nome_mot,email,cpf_mot,cnh,telefone_mot,senha,idade) values(?,?,?,?,?,?,?,?)");
			comandoSQL.setLong(1, motorista.getId_mot());
			comandoSQL.setString(2, motorista.getNome_mot());
			comandoSQL.setString(5, motorista.getEmail());
			comandoSQL.setString(3, motorista.getCpf_mot());
			comandoSQL.setString(4, motorista.getCnh());
			comandoSQL.setInt(6, (int) motorista.getTelefone_mot());
			comandoSQL.setString(7, motorista.getSenha());
			comandoSQL.setInt(8, motorista.getIdade());
			
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Motorista buscarPorId(Long id) {

		PreparedStatement comandoSQL = null;
		try {
			Motorista motorista = new Motorista();
			comandoSQL = conexao.prepareStatement("select * from motorista where  id_mot = ?");
			comandoSQL.setLong(1, id);
			ResultSet rs = comandoSQL.executeQuery();
			if (rs.next()) {
				motorista.setId_mot(rs.getLong(1));
				motorista.setNome_mot(rs.getString(2));
				motorista.setEmail(rs.getString(3));
				motorista.setCpf_mot(rs.getString(4));
				motorista.setCnh(rs.getString(5));
				motorista.setTelefone_mot(rs.getLong(6));
				motorista.setSenha(rs.getString(7));
				motorista.setIdade(rs.getInt(8));

			}
			conexao.close();
			comandoSQL.close();
			return motorista;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Motorista> buscarTudo() {

		ArrayList<Motorista> listaMotorista = new ArrayList<Motorista>();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from motorista order by nome_mot");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Motorista motorista = new Motorista();
				motorista.setId_mot(rs.getLong(1));
				motorista.setNome_mot(rs.getString(2));
				motorista.setEmail(rs.getString(3));
				motorista.setCpf_mot(rs.getString(4));
				motorista.setCnh(rs.getString(5));
				motorista.setTelefone_mot(rs.getLong(6));
				motorista.setSenha(rs.getString(7));
				motorista.setIdade(rs.getInt(8));

				listaMotorista.add(motorista);
			}
			conexao.close();
			comandoSQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaMotorista;
	}

	public void alterar(Motorista motorista) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("update motorista set nome_mot = ?, email = ? where id_mot = ?");
			comandoSQL.setString(1, motorista.getNome_mot());
			comandoSQL.setString(2, motorista.getEmail());
			comandoSQL.setLong(3, motorista.getId_mot());

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
			comandoSQL = conexao.prepareStatement("delete from motorista where id_mot = ?");
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
