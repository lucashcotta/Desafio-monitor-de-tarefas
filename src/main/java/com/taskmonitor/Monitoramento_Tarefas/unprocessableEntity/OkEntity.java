package com.taskmonitor.Monitoramento_Tarefas.unprocessableEntity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class OkEntity extends RuntimeException {
    public OkEntity(String message){
        super(message);
    }

}
