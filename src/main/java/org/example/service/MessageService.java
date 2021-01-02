package org.example.service;

import org.example.beans.MessageBean;
import org.example.model.Message;
import org.example.resources.MessageResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Path("/messages")
public class MessageService
{
    MessageResource messageResource = new MessageResource();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Message> getMessage(@BeanParam MessageBean messageBean)
    {
        return messageResource.getAllMessage();
    }


    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message test(@PathParam("messageId") long messageId)
    {
       return messageResource.getMessage(messageId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message)
    {
       return messageResource.addMessage(message);
    }



    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") long messageId, Message message)
    {
        message.setId(messageId);
        return messageResource.updateMessage(message);
    }

    @Path("/{messageId}/comments")
    public CommentResource getCommentResource()
    {
        return new CommentResource();
    }

}
