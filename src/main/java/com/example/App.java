package com.example;

import static jakarta.json.Json.createObjectBuilder;

import jakarta.json.JsonObject;

public class App {

    public static void main(String[] args) {
        JsonObject deliveryEvent = createObjectBuilder()
            .add("mail", createObjectBuilder()
                .add("timestamp", "2021-07-09T09:02:45.234386+00:00")
                .add("messageId", "3191054b-ef87-4959-81af-9e851088a507")
                .build()
            ).build();
    }
}

