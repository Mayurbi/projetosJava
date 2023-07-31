package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.enuns.tipoVeiculoEnum;

public class VeiculoDAO {
	private Connection conexao = null;

	public VeiculoDAO() {
		this.conexao = GerenciadorBD.obterConexao();
	}

	public void cadastrar(Veiculo veiculo, Integer idMotorista) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("insert into veiculo (id_veiculo,renavam,motorista_id_mot,tipoveiculo,placa) values(?,?,?,?,?)");
			comandoSQL.setLong(1, veiculo.getId_veiculo());
			comandoSQL.setString(2, veiculo.getRenavam());
			comandoSQL.setInt(3, idMotorista);
			comandoSQL.setString(4, veiculo.getTipoVeiculo().toString());
			comandoSQL.setString(5, veiculo.getPlaca());

			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Veiculo buscarPorId(Long id) {

		PreparedStatement comandoSQL = null;
		try {
			Veiculo veiculo = new Veiculo();
			comandoSQL = conexao.prepareStatement("select * from veiculo where  id_veiculo = ?");
			comandoSQL.setLong(1, id);
			ResultSet rs = comandoSQL.executeQuery();
			if (rs.next()) {
				veiculo.setId_veiculo(rs.getLong(1));
				veiculo.setRenavam(rs.getString(2));
				veiculo.setTipoVeiculo(tipoVeiculoEnum.valueOf(rs.getString(4)));
				veiculo.setPlaca(rs.getString(5));
			}
			conexao.close();
			comandoSQL.close();

			return veiculo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Veiculo> buscarTudo() {

		ArrayList<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from veiculo order by id_veiculo");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setId_veiculo(rs.getLong(1));
				veiculo.setRenavam(rs.getString(2));
				veiculo.setTipoVeiculo(tipoVeiculoEnum.valueOf(rs.getString(4)));
				veiculo.setPlaca(rs.getString(5));

				listaVeiculo.add(veiculo);
			}
			conexao.close();
			comandoSQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaVeiculo;
	}

	public void alterar(Veiculo veiculo) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"update veiculo set id_mot = ?, renavam = ?, tipo_veiculo = ? where id_veiculo = ?");
			comandoSQL.setLong(1, veiculo.getId_veiculo());
			comandoSQL.setString(2, veiculo.getRenavam());
			comandoSQL.setString(3, veiculo.getTipoVeiculo().toString());
			comandoSQL.setString(4, veiculo.getPlaca());

			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void excluir(Long idVeiculo) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("delete from veiculo where id_veiculo = ?");
			comandoSQL.setLong(1, idVeiculo);

			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
