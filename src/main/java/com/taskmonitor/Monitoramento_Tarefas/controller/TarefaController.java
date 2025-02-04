package com.taskmonitor.Monitoramento_Tarefas.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmonitor.Monitoramento_Tarefas.dto.TarefaServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.services.TarefaService;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
@RequestMapping("/tarefa")

public class TarefaController {

    private TarefaService tarefaService;
    

    @PostMapping
    public ResponseEntity<Void> adicionaTarefaMap(@RequestBody TarefaServiceDto tarefaServiceDto){
        tarefaService.adiocionaTarefa(tarefaServiceDto);

        return ResponseEntity.ok().build();

    }
    

    @GetMapping
    public ResponseEntity<Map <Long,TarefaServiceDto>> buscaTarefas(){

        Map<Long, TarefaServiceDto> lista = tarefaService.buscaTarefas();

        if(lista.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.ok(lista);
        }
        
        
    } 
}
