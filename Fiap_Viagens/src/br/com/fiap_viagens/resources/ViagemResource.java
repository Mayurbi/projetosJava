package br.com.fiap_viagens.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap_viagens.bo.ViagemBO;
import br.com.fiap_viagens.entity.Viagem;

@Path("/viagem")
public class ViagemResource {

private ViagemBO viagemBO = new ViagemBO();

	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Viagem> buscarTudo(){
		viagemBO.listar();
		return viagemBO.listar();
		
	}
	
	@GET
	@Path("/id")
	@Produces(MediaType.APPLICATION_JSON)
	public Viagem buscarPorId(int id){
		viagemBO.buscarPorId(id);
		return viagemBO.buscarPorId(id);
	
		
	}
	
	@POST
	@Path("/cadastro")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Viagem v, @Context UriInfo uriInfo) {
		viagemBO.inserir(v);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(v.getId()));
		return Response.created(builder.build()).build();
		
	}
}
