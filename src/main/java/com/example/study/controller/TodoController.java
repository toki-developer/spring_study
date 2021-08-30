package com.example.study.controller;

import com.example.study.model.Todo;
import com.example.study.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    List<Todo> searchTodoAll(@RequestParam(name = "is_completed", defaultValue = "0" ) int isCompleted, @RequestParam(name = "sort_type", defaultValue = "0") int sortType) {
        return service.searchTodoAll(isCompleted, sortType);
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    Todo searchTodoOne(@PathVariable String id) {
        return service.searchTodoOne(id);
    }
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    Todo createTodo (@RequestBody Todo todo ){
        return service.createTodo(todo);
    }

    @PatchMapping("{id}")
    Todo editTodo(@PathVariable String id, @RequestBody Todo newTodo){
        return service.editTodo(id, newTodo);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteTodo(@PathVariable String id){
        service.deleteTodo(id);
    }

    @PatchMapping("{id}/completed")
    @ResponseStatus(HttpStatus.OK)
    Todo completedTodo(@PathVariable String id){
        return service.completeTodo(id);
    }

    @PatchMapping("{id}/incomplete")
    @ResponseStatus(HttpStatus.OK)
    Todo incompleteTodo(@PathVariable String id){
        return service.incompleteTodo(id);
    }
}
