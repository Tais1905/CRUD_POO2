package com.example.AnimalAula.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.AnimalAula.model.Fornecedor;
import com.example.AnimalAula.repository.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos() {
        return repository.findAll();
    }

    public Fornecedor atualizar(Long id, Fornecedor fornecedor) {
        fornecedor.setId(id);
        return repository.save(fornecedor);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
