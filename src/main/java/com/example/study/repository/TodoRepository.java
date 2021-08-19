package com.example.study.repository;

import com.example.study.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, String> {
    List<Todo> findAll();
}
