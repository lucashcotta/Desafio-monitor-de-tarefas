package com.taskmonitor.Monitoramento_Tarefas.services;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.taskmonitor.Monitoramento_Tarefas.dto.EstatisticasServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.dto.TarefaServiceDto;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EstatisticaService {

    private final TarefaService tarefaService;

    public EstatisticasServiceDto estatisticasTarefas(){
        Map<Long,TarefaServiceDto> tarefas = tarefaService.buscaTarefas();
        int totalTarefa = tarefaService.buscaTarefas().size();

        
        int contConcluida = 0;
        int contEmAndamento = 0;

        for(TarefaServiceDto  dto: tarefas.values()){
            if(dto.isConcluida()){
                contConcluida++;
            }else{
                contEmAndamento++;
            }
        }

        double percentualConcluido = (contConcluida * 100)/(contConcluida + contEmAndamento);

        return new EstatisticasServiceDto(totalTarefa, contConcluida, contEmAndamento, percentualConcluido);
        
    }
}
