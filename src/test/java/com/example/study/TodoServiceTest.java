package com.example.study;

//import com.example.study.model.Todo;
//import com.example.study.service.TodoService;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.function.Executable;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.transaction.annotation.Transactional;

//import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@Transactional
//@DataJdbcTest
public class TodoServiceTest {

//    @Autowired
//    TodoService service;
//
//    @Test
//    @Sql(statements = "INSERT INTO todo (title, description, importance, period) VALUES ('test title', 'test desc', '3', '2000-11-12')")
//    void 一件取得のテスト(){
////        Todo todo = service.searchTodoOne("1");
////        List<Todo> todos = service.searchTodoAll();
////        assertAll("todo",
////                () -> assertEquals("test title",todo.getTitle()),
////                () -> assertEquals("test desc",todo.getDescription())
////                );
//        assertEquals(1,1);
//    }

    @Test
    public void 簡単なテスト(){
        assertEquals(1,1 );
    }
}
