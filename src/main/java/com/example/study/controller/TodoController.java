package com.example.study.controller;

import com.example.study.model.Todo;
import com.example.study.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoRepository repository;

    @GetMapping("")
    List<Todo> searchTodoAll() {
        return repository.findAll();
    }
    @PostMapping("")
    Todo postTodo (@RequestBody Todo todo ){
        return repository.save(todo);
    }
}
