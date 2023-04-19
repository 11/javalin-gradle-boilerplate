package org.example.app;

import org.example.controllers.*;

import io.javalin.Javalin;
import static io.javalin.apibuilder.ApiBuilder.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);
    public static short PORT = 7312;

    public static void main(String [] args) {
        var app = Javalin
            .create()
            .start(PORT);

        app.routes(() -> {
            path("ping", () -> {
                get(PingController::ping);
            });
        });

    }
}

