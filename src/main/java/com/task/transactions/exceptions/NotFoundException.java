package com.task.transactions.exceptions;


import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class notFoundExecption extends RuntimeException{
    public notFoundException(String message){
        super(message);
    }

}
