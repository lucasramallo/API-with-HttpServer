package org.example.server.util;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class createEndpointHandler implements HttpHandler {
    private String json = null;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        exchange.sendResponseHeaders(200, this.json.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(this.json.getBytes());
        os.close();
    }

    public void generateJSON(Object object) {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        this.json = json;
    }
}