package org.example.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;

public class Server {
    public Server(int port) throws IOException {
        create(port);
    }

    public Server() {
        //No args constructor;
    }

    public void create(int port) throws IOException {
        ServerInstance.getInstance().create(port);
    }
}
