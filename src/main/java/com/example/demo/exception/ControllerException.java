package com.example.demo.exception;


import com.example.demo.exception.model.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseException> badRequestError(BadRequestException ex){
        ResponseException responseError = new ResponseException(LocalDateTime.now(), ex.getDetail(), ex.getMessage(), null);
        return new ResponseEntity<>( responseError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UprocessEntityException.class)
    public ResponseEntity<ResponseException> unprocessError(UprocessEntityException ex){
            ResponseException responseError = new ResponseException(LocalDateTime.now(), null, ex.getMessage(), "sasd");
        return new ResponseEntity<>( responseError, HttpStatus.BAD_REQUEST);


    }


}
