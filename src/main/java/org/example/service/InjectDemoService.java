package org.example.service;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/injectDemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoService
{
    @GET
    @Path("annotation")
    public String getInjectedDemo(@MatrixParam("param") String matrixParam, @CookieParam("cookie") String cookieParam,
                                  @HeaderParam("header") String headerParam)
    {
        return "Matrix param :" + matrixParam + "Matrix param :" +cookieParam + "header param" +headerParam;
    }

    @GET
    @Path("context")
    public String getContext(@Context UriInfo uriInfo, @Context SecurityContext securityContext, @Context HttpHeaders httpHeaders)
    {
        String sec = securityContext.getAuthenticationScheme();

        return "security context" + sec + "uri info" + uriInfo + "http header" +httpHeaders;
    }

}
