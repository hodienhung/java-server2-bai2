package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        for (int i = 1; i <= 10; i++) {
            tasks.add(new Task((long) i, "Task " + i, "Description for task " + i, i % 2 == 0 ? "HIGH" : "LOW", "john_doe"));
        }
    }

    public List<Task> findAll() {
        return tasks;
    }
}
