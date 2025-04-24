package com.exemplo.tarefas.repository;

import com.exemplo.tarefas.model.Tarefa;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("relacional")
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {}