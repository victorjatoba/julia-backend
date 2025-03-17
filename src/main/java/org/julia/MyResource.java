package org.julia;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;

@Path("/")
@Produces({MediaType.TEXT_PLAIN})
public class MyResource {
    @GET
    public String message() {
        return "Hi";
    }
}
