package br.com.fiap.resource;

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
import br.com.fiap.BO.VeiculoBO;
import br.com.fiap.DAO.VeiculoDAO;
import br.com.fiap.entity.Usuario;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.enuns.tipoVeiculoEnum;



@Path("/veiculo")
public class VeiculoResource {
	private VeiculoBO vbo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Veiculo> buscarTudo() {
		vbo = new VeiculoBO();
		return vbo.buscarTudo();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Veiculo buscar(@PathParam("id") Long id) {
		vbo = new VeiculoBO();
		return vbo.buscar(id);
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response alterar(String jsonRequest, @Context UriInfo uriInfo) {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		vbo = new VeiculoBO();
		Integer id = (Integer) jsonObject.get("id_veiculo");
		String renavam = (String) jsonObject.get("renavam");
		String tipo = (String) jsonObject.get("tipo_veiculo");
		String placa = (String) jsonObject.get("placa");
		Integer idMotorista = (Integer) jsonObject.get("id_motorista");
		
		tipoVeiculoEnum tipoVeiculo = tipoVeiculoEnum.valueOf(tipo.toString().toUpperCase());

		Veiculo veiculo = new Veiculo(id, renavam, tipoVeiculo, placa);
		vbo.alterar(veiculo, idMotorista);
		return Response.ok().build();
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response cadastrar(String jsonRequest, @Context UriInfo uriInfo) {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		vbo = new VeiculoBO();
		Integer id = (Integer) jsonObject.get("id_veiculo");
		String renavam = (String) jsonObject.get("renavam");
		String tipo = (String) jsonObject.get("tipo_veiculo");
		String placa = (String) jsonObject.get("placa");
		Integer idMotorista = (Integer) jsonObject.get("id_motorista");
		
		tipoVeiculoEnum tipoVeiculo = tipoVeiculoEnum.valueOf(tipo.toString().toUpperCase());

		Veiculo veiculo = new Veiculo(id, renavam, tipoVeiculo, placa);
		vbo.cadastrar(veiculo, idMotorista);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void excluir(Veiculo veiculo, @PathParam("id") Long id) {
		vbo = new VeiculoBO();
		vbo.excluir(id);

	}
}
