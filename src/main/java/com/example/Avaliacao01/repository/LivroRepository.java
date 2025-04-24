package com.example.Avaliacao01.repository; 

import com.example.Avaliacao01.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> { }
