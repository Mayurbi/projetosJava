package br.com.fiap.BO;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.DAO.VeiculoDAO;
import br.com.fiap.entity.Veiculo;

@XmlRootElement
//classe para conectar o resource
public class VeiculoBO {
	private VeiculoDAO veicdao;

	public ArrayList<Veiculo> buscarTudo() {
		veicdao = new VeiculoDAO();
		return veicdao.buscarTudo();
	}

	public void cadastrar(Veiculo veiculo, Integer idMotorista) {
		veicdao = new VeiculoDAO();
		veicdao.cadastrar(veiculo, idMotorista);
	}

	public void alterar(Veiculo veiculo, Integer idMotorista) {
		veicdao = new VeiculoDAO();
		veicdao.alterar(veiculo);
	}

	public Veiculo buscar(Long id) {
		veicdao = new VeiculoDAO();
		return veicdao.buscarPorId(id);
	}

	public void excluir(Long id) {
		veicdao = new VeiculoDAO();
		veicdao.excluir(id);

	}
}
