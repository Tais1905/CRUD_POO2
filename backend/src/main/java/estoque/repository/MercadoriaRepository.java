package com.example.AnimalAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AnimalAula.model.Mercadoria;

@Repository
public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {
    List<Mercadoria> findByQuantidadeGreaterThan(Integer quantidade);
}
