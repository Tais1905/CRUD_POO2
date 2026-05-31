package com.example.AnimalAula.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mercadoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataValidade;
    private LocalDate dataCadastro;
    private String fornecedor;
    private Integer quantidade;
}
