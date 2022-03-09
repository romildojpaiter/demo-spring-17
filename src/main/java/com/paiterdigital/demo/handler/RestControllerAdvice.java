package com.paiterdigital.demo.handler;

import com.paiterdigital.demo.exception.NotFoundRegistry;
import com.paiterdigital.demo.handler.model.ErrorResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@org.springframework.web.bind.annotation.RestControllerAdvice
public class RestControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundRegistry.class)
    public ErrorResult exceptionHandler(NotFoundRegistry e) {
        return new ErrorResult(e.getMessage(), LocalDateTime.now());
    }

}
