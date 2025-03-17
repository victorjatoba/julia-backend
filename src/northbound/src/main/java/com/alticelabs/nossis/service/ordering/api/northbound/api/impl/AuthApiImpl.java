package com.alticelabs.nossis.service.ordering.api.northbound.api.impl;

import com.alticelabs.nossis.service.ordering.api.northbound.api.AuthApi;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

public class AuthApiImpl implements AuthApi {

    @Inject
    public AuthApiImpl() {
    }

    @Override
    public Response getConnection() {
        return Response.ok("Julia is alive, again!")
                .header("X-Result-Count", 1)
                .header("X-Total-Count", 1)
                .build();
    }
}