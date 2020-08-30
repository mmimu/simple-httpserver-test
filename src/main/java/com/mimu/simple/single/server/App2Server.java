package com.mimu.simple.single.server;

import com.mimu.simple.httpserver.SimpleHttpServer;
import com.mimu.simple.single.server.config.AppConfig;

public class App2Server {
    public static void main(String[] args) {
        SimpleHttpServer server = SimpleHttpServer.getServer().config(AppConfig.class).port(39092).create();
        server.startServer();
    }
}
