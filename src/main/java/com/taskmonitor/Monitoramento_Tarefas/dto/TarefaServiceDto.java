package com.taskmonitor.Monitoramento_Tarefas.dto;

import java.time.OffsetDateTime;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TarefaServiceDto{
    
    private int id;
    private String Descricao;
    private OffsetDateTime dataCriacao;
    private OffsetDateTime prazo;
    private boolean concluida;

}
