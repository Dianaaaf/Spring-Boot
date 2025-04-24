package com.example.democrud.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@EntityScan("com.example.democrud.model")

@Entity
public class Produto {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String nome; 
    private String descricao; 

    public Produto() { }

    public Produto(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() { return id; }
    public String getnome() { return nome; }
    public String getdescricao() { return descricao; }

    public void setId(Long id) { this.id = id; }
    public void setnome(String nome) { this.nome = nome; }
    public void setdescricao(String descricao) { this.descricao = descricao; }
}
