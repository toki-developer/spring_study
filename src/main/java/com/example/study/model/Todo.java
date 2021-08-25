package com.example.study.model;

//import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Date;

@Data
//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Todo {
    @Id
    private String id;
    private String title;
    private String description;
    private int importance = -1;
    private int completed;
    private Date period;
    @Column("created_at")
    private Date createdAt;
    @Column("updated_at")
    private Date updatedAt;
}
