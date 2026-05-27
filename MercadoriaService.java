package com.example.AnimalAula.service;

import org.springframework.stereotype.Service;

import com.example.AnimalAula.repository.MercadoriaRepository;

@Service
public class MercadoriaService {
    private final MercadoriaRepository animalRepository;

    public MercadoriaService(MercadoriaRepository repository){
        this.animalRepository = repository;
        return repository.findByQuantidadeGreaterThan(0);
    }
}
