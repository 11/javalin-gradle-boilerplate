package org.example.controllers;

import io.javalin.http.Context;

public class PingController {
    public static void ping(Context ctx) {
        ctx.result("pong");
    }
}
