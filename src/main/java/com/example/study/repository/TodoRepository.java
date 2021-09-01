package com.example.study.repository;

import com.example.study.model.Todo;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, String> {
//    List<Todo> findAll();

    @Query("SELECT * FROM todo where completed = :isCompleted")
    List<Todo> findTodos(@Param("isCompleted") int isCompleted);

    @Query("SELECT * FROM todo where completed = :isCompleted order by importance desc")
    List<Todo> findTodosOrderByImportance(@Param("isCompleted") int isCompleted);

    @Query("SELECT * FROM todo where completed = :isCompleted order by period")
    List<Todo> findTodosOrderByPeriod(@Param("isCompleted") int isCompleted);

    @Query("SELECT " +
            "(CASE " +
                "WHEN :isCompleted = 0 THEN 'ご飯' " +
                "WHEN :isCompleted = 1 THEN 'ライス' " +
                "ELSE '米' END ) as ans"
            )
    String testSample(@Param("isCompleted") int isCompleted);
}
