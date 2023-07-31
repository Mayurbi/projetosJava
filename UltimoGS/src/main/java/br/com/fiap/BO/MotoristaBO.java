package br.com.fiap.BO;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.DAO.MotoristaDAO;
import br.com.fiap.entity.Motorista;

@XmlRootElement
//classe para conectar o resource
public class MotoristaBO {
	private MotoristaDAO mdao;

	public ArrayList<Motorista> buscarTudo() {
		mdao = new MotoristaDAO();
		return mdao.buscarTudo();
	}

	public void cadastrar(Motorista motorista) {
		mdao = new MotoristaDAO();
		mdao.cadastrar(motorista);
	}

	public void alterar(Motorista motorista) {
		mdao = new MotoristaDAO();
		mdao.alterar(motorista);
	}

	public Motorista buscar(Long id) {
		mdao = new MotoristaDAO();
		return mdao.buscarPorId(id);
	}

	public void excluir(Long id) {
		mdao = new MotoristaDAO();
		mdao.excluir(id);

	}
}
