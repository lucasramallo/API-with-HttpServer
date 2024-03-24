package org.example.Repository;

import org.example.Domain.User;
import org.example.db.Database;

import java.util.List;

public class UserRepository {
    public void save(User user) {
        Database.getInstance().saveUser(user);
    }

    public List<User> getAll() {
        return Database.getInstance().getUsers();
    }
}
