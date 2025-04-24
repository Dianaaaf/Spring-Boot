package com.example.crudbase.model;

import org.springframework.boot.autoconfigure.domain.EntityScan; // Configura o escaneamento de entidades.
import jakarta.persistence.Entity; // Marca a classe como uma entidade JPA.
import jakarta.persistence.GeneratedValue; // Gera valores automaticamente para campos.
import jakarta.persistence.GenerationType; // Define a estratégia de geração de valores.
import jakarta.persistence.Id; // Marca o campo como chave primária.
import lombok.AllArgsConstructor; // Gera automaticamente um construtor com todos os campos.
import lombok.Data; // Gera automaticamente getters, setters, equals, hashCode e toString.

// Configura o escaneamento de entidades no pacote especificado.
@EntityScan("com.example.crudbase.model")

// Marca a classe como uma entidade JPA, permitindo que ela seja mapeada para uma tabela no banco de dados.
@Entity
// Gera automaticamente métodos como getters, setters, equals, hashCode e toString.
@Data
// Gera automaticamente um construtor que aceita todos os campos como parâmetros.
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String nome; 
    private String descricao; 
}
