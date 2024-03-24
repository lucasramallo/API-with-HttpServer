package org.example.db;

import org.example.Domain.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<User> users;
    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public Database() {
        this.users = new ArrayList<>();
    }

    public void saveUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
