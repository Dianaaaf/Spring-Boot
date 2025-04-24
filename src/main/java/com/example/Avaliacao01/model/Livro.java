package com.example.Avaliacao01.model; 

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Integer anoPublicacao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonIgnore
    private Autor autor;
}
