package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<TodoItem> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        tasks.add(new TodoItem(title));
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public void markTaskComplete(int index) {
        tasks.get(index).markComplete();
    }

    public void updateTaskTitle(int index, String newTitle) {
        tasks.get(index).setTitle(newTitle);
    }

    public List<TodoItem> getTasks() {
        return tasks;
    }
}

