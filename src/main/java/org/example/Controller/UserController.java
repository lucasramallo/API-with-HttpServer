package org.example.Controller;

import org.example.Domain.User;
import org.example.Repository.UserRepository;
import org.example.server.Annotations.RestController;
import org.example.server.CreateEndpoint;

import java.lang.annotation.Retention;
import java.util.List;

public class UserController {
    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public void createUser(User user) {
        this.repository.save(user);
    }

    @RestController
    public List<User> getAll() {
        CreateEndpoint createEndpoint = new CreateEndpoint("/user", "GET", repository.getAll());
        return repository.getAll();
    }
}
