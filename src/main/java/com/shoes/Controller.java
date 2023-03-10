package com.shoes;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;


@Path("/shoe")
public class Controller {
    
    Model m = new Model();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{brand}/{number}/{color}/")
    public Response shoe2(@PathParam String brand, @PathParam Integer number, @PathParam String color) {	
		List<Shoe> shoesFounds = m.searchEspecification(new Especification(brand, number, color));	
		String json = new Gson().toJson(shoesFounds);
    	return Response.status(200).entity(json).build();	
    }

}
