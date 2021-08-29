package com.example.study.shared;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id){
        super("Could not find todo " + id);
    }
}
