package com.taskmonitor.Monitoramento_Tarefas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmonitor.Monitoramento_Tarefas.dto.EstatisticasServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.services.EstatisticaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/estatistica")
public class EstatisticasController {

    private EstatisticaService estatisticaService;
    @GetMapping
    public ResponseEntity<EstatisticasServiceDto> buscaEstatisticas(){

        
        return ResponseEntity.status(HttpStatus.CREATED).body(estatisticaService.estatisticasTarefas());

    }
}
