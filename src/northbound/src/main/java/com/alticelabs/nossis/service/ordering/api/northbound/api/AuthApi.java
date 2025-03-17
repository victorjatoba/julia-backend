package com.alticelabs.nossis.service.ordering.api.northbound.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/connect")
public interface AuthApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response getConnection();
}
