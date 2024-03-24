package org.example.server;

import com.sun.net.httpserver.HttpServer;
import org.example.server.util.createEndpointHandler;

public class CreateEndpoint {
    public CreateEndpoint(String path, String method, Object object) {
        HttpServer server = ServerInstance.getInstance().getServer();

        createEndpointHandler hendler = new createEndpointHandler();
        hendler.generateJSON(object);
        server.createContext("/api" + path, hendler);
    }
}
