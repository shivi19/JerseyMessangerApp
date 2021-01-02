package org.example.resources;

import org.example.database.DataBaseClass;
import org.example.model.Message;

import java.util.Collection;
import java.util.Map;

public class MessageResource
{
    private Map<Long, Message> messageMapmessageMap = DataBaseClass.getMessage();

    public MessageResource()
    {
        messageMapmessageMap.put(1l, new Message(1l, "hello world", "shivangi"));
        messageMapmessageMap.put(2l, new Message(2l, "hello jsey", "pooja"));
    }



    public Collection<Message> getAllMessage()
    {
     return messageMapmessageMap.values();
    }

    public Message getMessage(long id)
    {
        return messageMapmessageMap.get(id);
    }

    public Message addMessage(Message message)
    {
        message.setId(messageMapmessageMap.size()+1);
        messageMapmessageMap.put(message.getId(), message);
        return message;

    }

    public Message removeMessage(long id)
    {
       return messageMapmessageMap.remove(id);
    }

    public Message updateMessage(Message message)
    {
        if(message.getId() <= 0)
        {
            return null;
        }
        messageMapmessageMap.put(message.getId(), message);
        return message;
    }
}
