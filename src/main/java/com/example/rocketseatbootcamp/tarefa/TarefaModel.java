package com.example.rocketseatbootcamp.tarefa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tabela_tarefa")
public class TarefaModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String descricao;
    @Column(length = 20)
    private String titulo;
    private LocalDateTime inicioEm;
    private LocalDateTime fimEm;
    private String prioridade;
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime criadoEm;

}
