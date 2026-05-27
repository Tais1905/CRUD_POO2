package com.example.AnimalAula.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AnimalAula.model.Mercadoria;
import com.example.AnimalAula.service.MercadoriaService;



@CrossOrigin(origins = "https://localhost:4200")
@RestController
@RequestMapping("/mercadorias")
public class MercadoriaController {
    private final MercadoriaService service;

    public MercadoriaController(MercadoriaService service){
        this.service = service;
    }

    @PostMapping
    public Mercadoria criar(@RequestBody Mercadoria mercadoria){
        return service.salvar(mercadoria);
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @PutMapping("path/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    
    @DeleteMapping("path/{id}")
    public String deleteMethodName(@PathVariable String id) {
        //TODO: process DELETE request
        return new String();
    }
    
}
