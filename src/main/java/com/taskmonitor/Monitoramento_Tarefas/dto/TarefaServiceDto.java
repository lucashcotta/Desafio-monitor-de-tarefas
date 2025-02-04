package com.taskmonitor.Monitoramento_Tarefas.dto;

import java.time.OffsetDateTime;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor

public class TarefaServiceDto{
    
    private String Descricao;
    private OffsetDateTime dataCriacao;
    private OffsetDateTime prazo;
    private boolean concluida;

}
