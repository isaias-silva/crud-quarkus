package org.acme.controllers;

import io.vertx.ext.web.handler.HttpException;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.entities.HqEntity;
import org.acme.services.HqService;
import org.acme.utils.exception.HttpError;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.Set;
import java.util.UUID;

@Path("/hq")
public class HqController {

    @Inject HqService service;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getHqs(){

        return this.service.getHqs();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object getHq(@QueryParam("id") Long id){
        try{
          return this.service.getHqById(id);

        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            throw new WebApplicationException("id inválido" ,400);

        }catch (HttpError e){

            throw new WebApplicationException(e.getMessage(),e.getStatus());
        }


    }
}








