package com.example.Avaliacao01.model; 

import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, nacionalidade;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Livro> livros;
}
