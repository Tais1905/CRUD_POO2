package com.example.AnimalAula.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.AnimalAula.model.Mercadoria;
import com.example.AnimalAula.service.MercadoriaService;

@RestController
@RequestMapping("/mercadorias")
@CrossOrigin(origins = "http://localhost:4200")
public class MercadoriaController {
    private final MercadoriaService service;

    public MercadoriaController(MercadoriaService service) {
        this.service = service;
    }

    @PostMapping
    public Mercadoria criar(@RequestBody Mercadoria mercadoria) {
        return service.salvar(mercadoria);
    }

    @GetMapping
    public List<Mercadoria> listar() {
        return service.listarTodos();
    }

    @GetMapping("/fornecedor/{nome}")
    public List<Mercadoria> listarPorFornecedor(@PathVariable String nome) {
        return service.listarPorFornecedor(nome);
    }

    @PutMapping("/{id}")
    public Mercadoria atualizar(@PathVariable Long id, @RequestBody Mercadoria mercadoria) {
        return service.atualizar(id, mercadoria);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
