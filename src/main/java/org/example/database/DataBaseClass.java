package org.example.database;

import org.example.model.Message;
import org.example.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class DataBaseClass
{
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessage()
    {
        return messages;
    }

    public static Map<Long, Profile> getProfiles()
    {
        return profiles;
    }


}
