package org.example.server;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public final class ServerInstance {
    private HttpServer server;
    private static ServerInstance instance;

    public static ServerInstance getInstance() {
        if (instance == null) {
            instance = new ServerInstance();
        }
        return instance;
    }

    public void create(int port) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.setExecutor(null);
        server.start();
        System.out.println("Server is running in port " + port + "! \uD83D\uDE80");

        this.server = server;
    }

    public HttpServer getServer() {
        return this.server;
    }

}
