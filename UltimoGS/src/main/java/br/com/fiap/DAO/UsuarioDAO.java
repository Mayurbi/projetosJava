package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import br.com.fiap.entity.Usuario;


@XmlRootElement
public class UsuarioDAO {
	private Connection conexao = null;

	public UsuarioDAO() {
		this.conexao = GerenciadorBD.obterConexao();
	}

	public void cadastrar(Usuario usuario) throws SQLException {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement(
					"insert into usuario (id_usu,nome_usu,email,cpf_usu,telefone_usu,senha,comentario) values(?,?,?,?,?,?,?)");
			comandoSQL.setLong(1, usuario.getId_usu());
			comandoSQL.setString(2, usuario.getNome_usu());
			comandoSQL.setString(3, usuario.getEmail());
			comandoSQL.setString(4, usuario.getCpf_usu());
			comandoSQL.setInt(5, usuario.getTelefone_usu());
			comandoSQL.setString(6, usuario.getSenha());
			comandoSQL.setString(7, "Comentário default");
			comandoSQL.executeUpdate();
			conexao.close();
			comandoSQL.close();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(e);
		}
	}

	public Usuario buscarPorId(Long id) {

		PreparedStatement comandoSQL = null;
		try {
			Usuario usuario = new Usuario();
			comandoSQL = conexao.prepareStatement("select * from usuario where id_usu = ?");
			comandoSQL.setLong(1, id);
			ResultSet rs = comandoSQL.executeQuery();
			if (rs.next()) {
				usuario.setId_usu(rs.getLong(1));
				usuario.setNome_usu(rs.getString(2));
				usuario.setEmail(rs.getString(3));
			}
			conexao.close();
			comandoSQL.close();

			return usuario;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}

	public ArrayList<Usuario> buscarTudo() {

		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("select * from usuario order by nome_usu");
			ResultSet rs = comandoSQL.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId_usu(rs.getLong(1));
				usuario.setNome_usu(rs.getString(2));
				usuario.setEmail(rs.getString(3));

				listaUsuario.add(usuario);
			}
			conexao.close();
			comandoSQL.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaUsuario;
	}

	public void alterar(Usuario usuario) {

		PreparedStatement comandoSQL = null;
		try {
			comandoSQL = conexao.prepareStatement("update usuario set nome_usu = ?, email = ? where id_usu = ?");
			comandoSQL.setString(1, usuario.getNome_usu());
			comandoSQL.setString(2, usuario.getEmail());
			comandoSQL.setLong(3, usuario.getId_usu());

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
			comandoSQL = conexao.prepareStatement("delete from usuario where id_usu = ?");
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
