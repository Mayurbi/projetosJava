package br.com.fiap.BO;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.entity.Usuario;

@XmlRootElement
//classe para conectar o resource
public class UsuarioBO {
	private UsuarioDAO udao;

	public ArrayList<Usuario> buscarTudo() {
		udao = new UsuarioDAO();
		return udao.buscarTudo();
	}

	public void cadastrar(Usuario usuario) throws SQLException {
		udao = new UsuarioDAO();
		udao.cadastrar(usuario);
	}

	public void alterar(Usuario usuario) {
		udao = new UsuarioDAO();
		udao.alterar(usuario);
	}

	public Usuario buscar(Long id) {
		udao = new UsuarioDAO();
		return udao.buscarPorId(id);
	}

	public void excluir(Long id) {
		udao = new UsuarioDAO();
		udao.excluir(id);

	}
}
