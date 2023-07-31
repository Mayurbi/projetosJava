package br.com.fiap_viagens.bo;

import java.util.ArrayList;

import br.com.fiap_viagens.dao.ViagemDAO;
import br.com.fiap_viagens.entity.Viagem;


public class ViagemBO {

private ViagemDAO dao = null;

	public ArrayList<Viagem> listar(){
		dao = new ViagemDAO();
		return dao.listAll();
	}
	
	public void inserir(Viagem v) {
		dao = new ViagemDAO();
		dao.inserir(v);
	}
	
	public Viagem buscarPorId(int id) {
		dao = new ViagemDAO();
		return dao.buscarPorId(id);
	}
}
