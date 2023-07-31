package br.com.fiap.BO;

import java.text.ParseException;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.DAO.ViagemDAO;
import br.com.fiap.entity.Viagem;

@XmlRootElement
//classe para conectar o resource
public class ViagemBO {
	private ViagemDAO vdao;

	public ArrayList<Viagem> buscarTudo() {
		vdao = new ViagemDAO();
		return vdao.buscarTudo();
	}

	public void cadastrar(Viagem viagem) throws ParseException {
		vdao = new ViagemDAO();
		vdao.cadastrar(viagem);
	}

	public void alterar(Viagem viagem) {
		vdao = new ViagemDAO();
		vdao.alterar(viagem);
	}

	public Viagem buscar(Long id) {
		vdao = new ViagemDAO();
		return vdao.buscarPorId(id);
	}

	public void excluir(Long id) {
		vdao = new ViagemDAO();
		vdao.excluir(id);

	}
}
