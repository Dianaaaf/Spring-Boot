package com.example.Avaliacao01.service; 

import com.example.Avaliacao01.model.Autor;
import com.example.Avaliacao01.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> findAll() {
        return autorRepository.findAll();
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public Optional<Autor> findById(Long id) {
        return autorRepository.findById(id);
    }

    public void delete(Long id) {
        autorRepository.deleteById(id);
    }

    public Autor update(Autor autor) {
        if (autorRepository.existsById(autor.getId())) {
            return autorRepository.save(autor);
        }
        return null;
    }
}
