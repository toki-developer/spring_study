package com.example.study.shared;

import lombok.Data;

@Data
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;

    ErrorResponse(String code, String message){
        this.errorCode = code;
        this.errorMessage = message;
    }
}
