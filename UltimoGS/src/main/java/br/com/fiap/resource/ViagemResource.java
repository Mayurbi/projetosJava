package br.com.fiap.resource;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import javax.ws.rs.core.UriInfo;

import org.json.JSONObject;

import br.com.fiap.BO.ViagemBO;
import br.com.fiap.entity.Viagem;
import br.com.fiap.enuns.eventosEnum;
import br.com.fiap.enuns.statusViagemEnum;
import br.com.fiap.enuns.tipoVeiculoEnum;

@Path("/viagem")
public class ViagemResource {
	private ViagemBO vbo;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Viagem> buscarTudo() {
		vbo = new ViagemBO();
		return vbo.buscarTudo();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Viagem buscar(@PathParam("id") Long id) {
		vbo = new ViagemBO();
		return vbo.buscar(id);
	}

	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response alterar(String jsonRequest, @Context UriInfo uriInfo) {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		vbo = new ViagemBO();
		Integer id = (Integer) jsonObject.get("id_viagem");
		String cep = (String) jsonObject.get("cep");
		String pontoInteresse = (String) jsonObject.get("ponto_interesse");
		String pontoSaida = (String) jsonObject.get("ponto_saida");
		String pontoChegada = (String) jsonObject.get("ponto_chegada");
		String horario = (String) jsonObject.get("horario");
		Integer valor = (Integer) jsonObject.get("valor");
		String eventos = (String) jsonObject.get("eventos");
		String statusViagem = (String) jsonObject.get("statusViagem");
		Integer idUsuario = (Integer) jsonObject.get("id_usuario");
	
		eventosEnum tipoEvento = eventosEnum.valueOf(eventos.toString().toUpperCase());
		statusViagemEnum tipoStatus = statusViagemEnum.valueOf(statusViagem.toString().toUpperCase());

		Viagem viagem  = new Viagem(id, cep, pontoInteresse, pontoSaida, pontoChegada, horario, valor, tipoEvento, tipoStatus);
		vbo.alterar(viagem);
		return Response.ok().build();
	}

	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response cadastrar(String jsonRequest, @Context UriInfo uriInfo) throws ParseException {
		JSONObject jsonObject = new JSONObject(jsonRequest);
		vbo = new ViagemBO();
		Integer id = (Integer) jsonObject.get("id_viagem");
		String cep = (String) jsonObject.get("cep");
		String pontoInteresse = (String) jsonObject.get("ponto_interesse");
		String pontoSaida = (String) jsonObject.get("ponto_saida");
		String pontoChegada = (String) jsonObject.get("ponto_chegada");
		String horario = (String) jsonObject.get("horario");
		Integer valor = (Integer) jsonObject.get("valor");
		String eventos = (String) jsonObject.get("eventos");
		String statusViagem = (String) jsonObject.get("status_viagem");
		Integer idUsuario = (Integer) jsonObject.get("id_usuario");
	
		eventosEnum tipoEvento = eventosEnum.valueOf(eventos.toString().toUpperCase());
		statusViagemEnum tipoStatus = statusViagemEnum.valueOf(statusViagem.toString().toUpperCase());

		Viagem viagem  = new Viagem(id, cep, pontoInteresse, pontoSaida, pontoChegada, horario, valor, tipoEvento, tipoStatus);
		vbo.cadastrar(viagem);
		return Response.ok().build();
	}

	@DELETE
	@Path("/{id}")
	public void excluir(Viagem vigame, @PathParam("id") Long id) {
		vbo = new ViagemBO();
		vbo.excluir(id);

	}
}