package org.example.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResource
{
    @GET
    public String test()
    {
        return "hello sub resource";
    }
}
