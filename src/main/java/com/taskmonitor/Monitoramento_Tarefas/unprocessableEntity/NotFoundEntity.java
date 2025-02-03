package com.taskmonitor.Monitoramento_Tarefas.unprocessableEntity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.RequestScope;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundEntity extends RuntimeException {
    public NotFoundEntity(String message){
        super(message);
    }
}
