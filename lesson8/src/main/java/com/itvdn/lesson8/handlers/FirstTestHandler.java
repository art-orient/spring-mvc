package com.itvdn.lesson8.handlers;

import com.itvdn.lesson8.exception.FirstTestException;
import com.itvdn.lesson8.exception.MainTestException;
import com.itvdn.lesson8.exception.SecondException;
import com.itvdn.lesson8.exception.ThirdException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FirstTestHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FirstTestException.class)
    public ResponseEntity handlerFirstException(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex,"first test exception", new HttpHeaders(), HttpStatus.FORBIDDEN, request);
    }

    @ExceptionHandler(MainTestException.class)
    public ResponseEntity handlerGroupExceptions(Exception ex, WebRequest request) {
        String message = "";
        if(ex.getClass().equals(SecondException.class)) {
            message = "second";
        } else if (ex.getClass().equals(ThirdException.class)) {
            message = "third";
        }
        return handleExceptionInternal(ex,message, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler(SecondException.class)
    public ResponseEntity second(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex,"individual second handler", new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
}
