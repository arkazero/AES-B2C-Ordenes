package com.ordenes.rs;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface RSOrdenes {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/peticion-post")
	public Integer ejemploPeticionPost(String data);
}
