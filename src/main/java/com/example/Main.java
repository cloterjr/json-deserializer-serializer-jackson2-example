package com.example;

import com.example.deserializer.UserDeserializer;
import com.example.deserializer.UserSerializer;
import com.example.enums.StatusEnum;
import com.example.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.util.UUID;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        final User user = new User(UUID.randomUUID(), "Test User", StatusEnum.ACTIVE);
        ObjectMapper mapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(User.class, new UserSerializer());
        mapper.registerModule(module);

        String serializedUser = mapper.writeValueAsString(user);

        System.out.println(String.format("Serialized User: %s", serializedUser));

        module.addDeserializer(User.class, new UserDeserializer());
        mapper.registerModule(module);

        User deserializedUser = mapper.readValue(serializedUser, User.class);

        System.out.println(String.format("Deserialized User: %s", deserializedUser));

    }
}
