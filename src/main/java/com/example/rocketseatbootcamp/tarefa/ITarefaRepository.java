package com.example.rocketseatbootcamp.tarefa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITarefaRepository extends JpaRepository<TarefaModel, UUID> {
}
