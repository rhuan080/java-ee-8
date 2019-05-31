package net.rhuanrocha.ejbserver.endpoint;

import net.rhuanrocha.ejbserver.ejbremotelocal.StatelessLocal;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/example")
public class ExampleEndpoint {

    @Inject
    private StatelessLocal statelessLocal;

    @GET
    @Path("/statelessremotelocal/local")
    public Response exampleUsingEjbRemoteLocalAsLocal(){

        return Response
                .ok(statelessLocal.helloWorld())
                .build();
    }
}

