package net.rhuanrocha.ejbclient.endpoint;

import net.rhuanrocha.ejbserver.ejbremotelocal.StatelessRemote;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.Properties;

@Path("/example")
public class ExampleEndpoint {

    @Resource(lookup = "ejb:/ejbserver-1.0-SNAPSHOT/ExampleSLSBRemoteLocal!net.rhuanrocha.ejbserver.ejbremotelocal.StatelessRemote")
    private StatelessRemote statelessRemoteLocal;

    @Resource(lookup = "ejb:/ejbserver-1.0-SNAPSHOT/ExampleSLSBRemote!net.rhuanrocha.ejbserver.ejbremote.StatelessRemote")
    private net.rhuanrocha.ejbserver.ejbremote.StatelessRemote statelessRemote;

    @GET
    @Path("/statelessremotelocal/remote")
    public Response exampleUsingEjbRemoteLocalAsRemote()  {


        return Response
                .ok(statelessRemoteLocal.helloWorld())
                .build();
    }

    @GET
    @Path("/statelessremote")
    public Response exampleUsingEjbRemote()  {


        return Response
                .ok(statelessRemote.helloWorld())
                .build();
    }
}
