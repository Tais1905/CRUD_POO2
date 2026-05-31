package com.example.AnimalAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AnimalAula.model.Fornecedor;

@Repository
public interface FornecedorRepository
        extends JpaRepository<Fornecedor, Long> {
}