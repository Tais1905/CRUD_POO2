package com.example.AnimalAula.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Mercadoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataValidade;
    private LocalDate dataCadastro;
    private String fornecedor;
    private Integer quantidade;

    public Mercadoria(){

    }
}