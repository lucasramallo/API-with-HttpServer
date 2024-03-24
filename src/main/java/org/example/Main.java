package org.example;

import org.example.Controller.UserController;
import org.example.Domain.User;
import org.example.Repository.UserRepository;
import org.example.db.Database;
import org.example.server.CreateEndpoint;
import org.example.server.Server;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        User user1 = new User("Lucas", "132.166.934-65");
        User user2 = new User("Maria", "475.234.522-12");

        Server server = new Server(8000);

        UserRepository userRepository = new UserRepository();
        UserController userController = new UserController(userRepository);

        userController.createUser(user1);
        userController.createUser(user2);

        userController.getAll();
    }
}