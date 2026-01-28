package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoListTest {

    private TodoList todoList;

    @BeforeEach
    void setUp() {
        todoList = new TodoList();
    }

    
    @Test
    void testAddTask() {
        todoList.addTask("Finish assignment");
        assertEquals(1, todoList.getTasks().size());
        assertEquals("Finish assignment", todoList.getTasks().get(0).getTitle());
    }

    @Test
    void testDeleteTask() {
        todoList.addTask("Task 1");
        todoList.deleteTask(0);
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    void testMarkTaskComplete() {
        todoList.addTask("Study for exam");
        todoList.markTaskComplete(0);
        assertTrue(todoList.getTasks().get(0).isCompleted());
    }

    @Test
    void testUpdateTaskTitle() {
        todoList.addTask("Old Title");
        todoList.updateTaskTitle(0, "New Title");
        assertEquals("New Title", todoList.getTasks().get(0).getTitle());

        //comment added
    }
}
