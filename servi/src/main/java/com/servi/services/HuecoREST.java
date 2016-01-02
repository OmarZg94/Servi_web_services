package com.servi.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.servi.dao.DaoHueco;
import com.servi.dto.DtoHueco;

@Path("/hueco")
public class HuecoREST {

	private List<DtoHueco> lstDtoHueco;
	private DaoHueco daoHueco = new DaoHueco();
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllAdmins() {
		lstDtoHueco = daoHueco.getAll();
		String json = new Gson().toJson(lstDtoHueco);
		return Response.status(Response.Status.OK).entity(json).build();
	}
}
