package com.taskmonitor.Monitoramento_Tarefas.controller;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmonitor.Monitoramento_Tarefas.dto.TarefaServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.services.TarefaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@RestController
@RequestMapping("/tarefa")
@Tag(name = "Tarefas", description = "Gerencia as tarefas em memória" )

public class TarefaController {

    private TarefaService tarefaService;
    

    @PostMapping
    @Operation(summary = "Adiciona tarefa ao Map", description = "Insere uma nova tarefa na memória, no caso, detro do MAP.")
    public ResponseEntity<Void> adicionaTarefaMap(@RequestBody TarefaServiceDto tarefaServiceDto){     
        tarefaServiceDto.setDataCriacao(OffsetDateTime.now());   
        tarefaService.adiocionaTarefa(tarefaServiceDto);

        return ResponseEntity.ok().build();

    }
    

    @GetMapping
    @Operation(summary = "Busca tarefas", description = "Retorna uma lista com todas as tarefas.")
    public ResponseEntity<Map <Long,TarefaServiceDto>> buscaTarefas(){

        Map<Long, TarefaServiceDto> lista = tarefaService.buscaTarefas();

        if(lista.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }else{
            return ResponseEntity.ok(lista);
        }
    }
    
    @GetMapping("/{id}")
    @Operation(summary = "Tarefa por ID", description = "Retorna uma tarefa especifica.")
    public ResponseEntity<TarefaServiceDto> buscaTarefaId(@PathVariable Long id){
        
        return ResponseEntity.ok(tarefaService.buscaTarefaId(id));
    }
    
    @PatchMapping("/{id}/status")
    @Operation(summary = "Altera status.", description = "Marca o campo Concluida como TRUE")
    public ResponseEntity<TarefaServiceDto> atualizaStatusTarefa(@PathVariable Long id){
       
        return ResponseEntity.status(HttpStatus.OK).body(tarefaService.atualizaStatus(id));
    }


    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta tarefa", description = "Apaga da memória uma tarefa")
    public ResponseEntity<Void> deletaTarefa(@PathVariable Long id){
        tarefaService.deletaTarefa(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
