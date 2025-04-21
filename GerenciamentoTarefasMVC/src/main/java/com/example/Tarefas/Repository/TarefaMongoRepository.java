package com.exemplo.tarefas.repository;

import com.exemplo.tarefas.model.Tarefa;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("mongo")
public interface TarefaMongoRepository extends MongoRepository<Tarefa, String> {}