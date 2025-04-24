package com.example.Avaliacao01.service; 

import com.example.Avaliacao01.model.Livro;
import com.example.Avaliacao01.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll() {
        return livroRepository.findAll();
    }

    public Livro save(Livro livro) {
        return livroRepository.save(livro);
    }

    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    public void delete(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro update(Livro livro) {
        if (livroRepository.existsById(livro.getId())) {
            return livroRepository.save(livro);
        }
        return null;
    }
}
