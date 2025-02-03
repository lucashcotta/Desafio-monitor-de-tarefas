package com.taskmonitor.Monitoramento_Tarefas.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EstatisticasServiceDto {
    private int totalTarefas;
    private int tarefasConcluidas;
    private int tarefasPendentes;
    double percentualConcluido;
}
