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

import br.com.fiap.BO.MotoristaBO;
import br.com.fiap.BO.UsuarioBO;
import br.com.fiap.DAO.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Usuario;

@Path("/motorista")
public class MotoristaResource {

	private MotoristaBO mbo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Motorista> buscarTudo() {
		mbo = new MotoristaBO();
		return mbo.buscarTudo();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Motorista buscar(@PathParam("id") Long id) {
		mbo = new MotoristaBO();
		return mbo.buscar(id);
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response cadastrar(String jsonRequest, @Context UriInfo uriInfo) throws SQLException {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		mbo = new MotoristaBO();
		Integer id = (Integer) jsonObject.get("id_mot");
		String nome = (String) jsonObject.get("nome_mot");
		String email = (String) jsonObject.get("email");
		String cpf = (String) jsonObject.get("cpf_mot");
		String cnh = (String) jsonObject.get("cnh");
		Integer telefone = (Integer) jsonObject.get("telefone_mot");
		String senha = (String) jsonObject.get("senha");
		Integer idade = (Integer) jsonObject.get("idade");

		Motorista motorista = new Motorista(id, nome, email, cpf, cnh, telefone, senha, idade);
		mbo.cadastrar(motorista);
		return Response.ok().build();
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response alterar(String jsonRequest, @Context UriInfo uriInfo) throws SQLException {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		mbo = new MotoristaBO();
		Integer id = (Integer) jsonObject.get("id_mot");
		String nome = (String) jsonObject.get("nome_mot");
		String email = (String) jsonObject.get("email");
		String cpf = (String) jsonObject.get("cpf_mot");
		String cnh = (String) jsonObject.get("cnh");
		Integer telefone = (Integer) jsonObject.get("telefone_mot");
		String senha = (String) jsonObject.get("senha");
		Integer idade = (Integer) jsonObject.get("idade");

		Motorista motorista = new Motorista(id, nome, email, cpf, cnh, telefone, senha, idade);
		mbo.alterar(motorista);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void excluir(Motorista motorista, @PathParam("id") Long id) {
		mbo = new MotoristaBO();
		mbo.excluir(id);

	}
}
