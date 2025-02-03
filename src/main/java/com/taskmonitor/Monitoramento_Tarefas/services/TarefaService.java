package com.taskmonitor.Monitoramento_Tarefas.services;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.taskmonitor.Monitoramento_Tarefas.dto.TarefaServiceDto;
import com.taskmonitor.Monitoramento_Tarefas.unprocessableEntity.NotFoundEntity;
import com.taskmonitor.Monitoramento_Tarefas.unprocessableEntity.OkEntity;
import com.taskmonitor.Monitoramento_Tarefas.unprocessableEntity.UnprocessableEntity;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class TarefaService {
    private TarefaServiceDto tarefaServiceDto;
    private Map<Long,TarefaServiceDto> tarefas = new ConcurrentHashMap<>();

    public  void adiocionaTarefa(TarefaServiceDto dto){
        if(tarefaServiceDto.getDataCriacao().isAfter(OffsetDateTime.now())){
            throw new UnprocessableEntity("HoraCriação não pode ser posterior ao horário atual");
        }else if(tarefaServiceDto.getPrazo().isBefore(OffsetDateTime.now())){
            throw new UnprocessableEntity(" Prazo não pode ser definido com uma data anterior a data de criacao do projeto");
        }else{
            tarefas.put(GeneretedIdService.generateId(),dto);
        }
    }


    public Map<Long,TarefaServiceDto> buscaTarefas(){
        return tarefas;
    }

    public void deletaTarefa(Long id){

        if(tarefas.get(id) == null){
            throw new NotFoundEntity("Id informado não existe"); 
        }
      tarefas.remove(id);
       

    }


    public Map<Long,TarefaServiceDto> atualizaStatus(Long id){
        TarefaServiceDto tarefa = tarefas.get(id);
        if(tarefa == null){
            throw new NotFoundEntity("Tarefa nao encontrada");
        }else if(tarefa.isConcluida() != true){
            tarefa.setConcluida(true);
            throw new OkEntity(" A tarefa foi marcada como concluida");
        }else{
            throw new OkEntity(" A tarefa já está marcada como concluida");
        }

    }
}
