package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User(1L, "john_doe", "john@gmail.com", "ADMIN"));
        users.add(new User(2L, "jane_smith", "jane@gmail.com", "USER"));
        users.add(new User(3L, "alex_turner", "alex@gmail.com", "USER"));
    }

    public List<User> findAll() {
        return users;
    }
}
