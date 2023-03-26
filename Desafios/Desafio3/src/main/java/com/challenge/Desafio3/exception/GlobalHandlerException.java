package com.challenge.Desafio3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {
    @ExceptionHandler(ClientAlreadyExistsException.class)
    public ResponseEntity<?> productAlreadyExitsException(Exception e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }
}
