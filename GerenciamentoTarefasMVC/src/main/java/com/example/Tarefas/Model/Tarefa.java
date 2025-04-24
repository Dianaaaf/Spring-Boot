package com.exemplo.tarefas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Entity
@Document(collection = "tarefas")
public class Tarefa {

    @jakarta.persistence.Id // Para JPA
    @org.springframework.data.annotation.Id // Para MongoDB
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotNull
    @Size(min = 3, max = 100)
    private String titulo;

    @Size(max = 500)
    private String descricao;

    @NotNull
    private String status;

    private LocalDateTime dataCriacao;
}