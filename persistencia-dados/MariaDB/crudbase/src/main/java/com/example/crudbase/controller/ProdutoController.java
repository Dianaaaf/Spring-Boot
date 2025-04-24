package com.example.crudbase.controller;

// Importações necessárias para o funcionamento do controlador REST.
import java.util.List; // Para trabalhar com listas de objetos.
import org.springframework.beans.factory.annotation.Autowired; // Injeta dependências automaticamente.
import org.springframework.http.ResponseEntity; // Representa respostas HTTP.
import org.springframework.web.bind.annotation.DeleteMapping; // Define endpoints para requisições DELETE.
import org.springframework.web.bind.annotation.GetMapping; // Define endpoints para requisições GET.
import org.springframework.web.bind.annotation.PathVariable; // Captura variáveis de caminho na URL.
import org.springframework.web.bind.annotation.PostMapping; // Define endpoints para requisições POST.
import org.springframework.web.bind.annotation.PutMapping; // Define endpoints para requisições PUT.
import org.springframework.web.bind.annotation.RequestBody; // Captura o corpo da requisição.
import org.springframework.web.bind.annotation.RequestMapping; // Define o caminho base para os endpoints.
import org.springframework.web.bind.annotation.RestController; // Marca a classe como um controlador REST.

import com.example.crudbase.model.Produto; // Importa o modelo Produto.
import com.example.crudbase.service.ProdutoService; // Importa o serviço ProdutoService para lógica de negócios.

@RestController
@RequestMapping("/api/crud")
public class ProdutoController {

    @Autowired
    private ProdutoService crudService;

    @GetMapping
    public List<Produto> getAll() { return crudService.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable Long id) {
        return crudService.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build()); 
    }

    @PostMapping
    public Produto create(@RequestBody Produto model) { return crudService.save(model); }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto model) {
        return crudService.update(id, model)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build()); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.notFound().build(); // Retorna 404 se o produto não for encontrado.
    }
}
