package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import br.com.fiap.BO.UsuarioBO;
import br.com.fiap.DAO.UsuarioDAO;
import br.com.fiap.entity.Usuario;

@Path("/usuario")
public class UsuarioResource {

	private UsuarioBO ubo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Usuario> buscarTudo() {
		ubo = new UsuarioBO();
		return ubo.buscarTudo();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscar(@PathParam("id") Long id) {
		ubo = new UsuarioBO();
		return ubo.buscar(id);

	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response cadastrar(String jsonRequest, @Context UriInfo uriInfo) throws SQLException {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		ubo = new UsuarioBO();
		Integer id = (Integer) jsonObject.get("id_usu");
		String nome = (String) jsonObject.get("nome_usu");
		String email = (String) jsonObject.get("email");
		String cpf = (String) jsonObject.get("cpf_usu");
		Integer telefone = (Integer) jsonObject.get("telefone_usu");
		String senha = (String) jsonObject.get("senha");

		Usuario usuario = new Usuario(id, nome, email, cpf, telefone, senha);
		ubo.cadastrar(usuario);
		return Response.ok().build();
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response alterar(String jsonRequest, @Context UriInfo uriInfo) {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		ubo = new UsuarioBO();
		Integer id = (Integer) jsonObject.get("id_usu");
		String nome = (String) jsonObject.get("nome_usu");
		String email = (String) jsonObject.get("email");
		String cpf = (String) jsonObject.get("cpf_usu");
		Integer telefone = (Integer) jsonObject.get("telefone_usu");
		String senha = (String) jsonObject.get("senha");

		Usuario usuario = new Usuario(id, nome, email, cpf, telefone, senha);
		ubo.alterar(usuario);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void excluir(Usuario usuario, @PathParam("id") Long id) {
		ubo = new UsuarioBO();
		ubo.excluir(id);

	}
}
