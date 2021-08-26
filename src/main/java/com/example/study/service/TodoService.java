package com.example.study.service;

import com.example.study.model.Todo;
import com.example.study.repository.TodoRepository;
import com.example.study.shared.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public List<Todo> searchTodoAll(int isCompleted, int sortType) {
        String a = repository.testSample(isCompleted);
        System.out.println(a);
        switch(sortType) {
            case 1:
                return repository.findTodosOrderByImportance(isCompleted);
            case 2:
                return repository.findTodosOrderByPeriod(isCompleted);
            default:
                return repository.findTodos(isCompleted);
        }

    }

    public Todo searchTodoOne(String id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Todo createTodo (Todo todo ){
        return repository.save(todo);
    }

    public Todo editTodo(String id, Todo newTodo){
        Todo editTodo = repository.findById(id).map(todo -> {
            if(newTodo.getTitle() != null) todo.setTitle(newTodo.getTitle());
            if(newTodo.getDescription() != null) todo.setDescription(newTodo.getDescription());
            if(newTodo.getImportance() != -1) todo.setImportance(newTodo.getImportance());
            if(newTodo.getPeriod() != null) todo.setPeriod(newTodo.getPeriod());
            return todo;
        }).orElseThrow(() -> new NotFoundException(id));
        return repository.save(editTodo);
    }

    public void deleteTodo(String id){
        repository.findById(id).orElseThrow(() -> new NotFoundException(id));
        repository.deleteById(id);
    }

    public Todo completeTodo(String id){
        return repository.findById(id).map(todo -> {
            todo.setCompleted(1);
            return repository.save(todo);
        }).orElseThrow(() -> new NotFoundException(id));
    }

    public Todo incompleteTodo(String id){
        return repository.findById(id).map(todo -> {
            todo.setCompleted(0);
            return repository.save(todo);
        }).orElseThrow(() -> new NotFoundException(id));
    }
}
