package com.taskmonitor.Monitoramento_Tarefas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmonitor.Monitoramento_Tarefas.dto.EstatisticasServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.services.EstatisticaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/estatistica")
@Tag(name = "Estatisticas", description = "Busca as estatisticas das terefas armazenadas em memória")
public class EstatisticasController {

    private EstatisticaService estatisticaService;
    @GetMapping
    @Operation(summary = "Lista os dados das tarefas", description = 
    "Retorna dados gerais das tarefas como tarefas concluidas, não concluidas.")
    public ResponseEntity<EstatisticasServiceDto> buscaEstatisticas(){

        
        return ResponseEntity.status(HttpStatus.CREATED).body(estatisticaService.estatisticasTarefas());

    }
}
