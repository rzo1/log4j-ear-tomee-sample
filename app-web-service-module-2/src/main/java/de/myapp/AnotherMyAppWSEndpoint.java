package de.myapp;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface AnotherMyAppWSEndpoint {

    String API_PATH = "/api/v0.1";

    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("alive")
    DifferentDemoResponse isAlive();

}
