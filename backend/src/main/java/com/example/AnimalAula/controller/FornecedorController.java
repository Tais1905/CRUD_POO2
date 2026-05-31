package com.example.AnimalAula.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.AnimalAula.model.Fornecedor;
import com.example.AnimalAula.service.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
@CrossOrigin(origins = "http://localhost:4200")
public class FornecedorController {
    private final FornecedorService service;

    public FornecedorController(FornecedorService service) {
        this.service = service;
    }

    @PostMapping
    public Fornecedor criar(@RequestBody Fornecedor fornecedor) {
        return service.salvar(fornecedor);
    }

    @GetMapping
    public List<Fornecedor> listar() {
        return service.listarTodos();
    }

    @PutMapping("/{id}")
    public Fornecedor atualizar(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        return service.atualizar(id, fornecedor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
