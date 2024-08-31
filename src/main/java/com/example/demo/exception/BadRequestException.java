package com.example.demo.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BadRequestException extends RuntimeException{

    private String detail;

    private String message;

    public BadRequestException(String message, String detail) {
        super(message);
        this.detail = detail;
        this.message = message;
    }
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
