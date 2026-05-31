package com.example.AnimalAula.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.AnimalAula.model.Mercadoria;
import com.example.AnimalAula.repository.MercadoriaRepository;

@Service
public class MercadoriaService {
    private final MercadoriaRepository repository;

    public MercadoriaService(MercadoriaRepository repository) {
        this.repository = repository;
    }

    public Mercadoria salvar(Mercadoria mercadoria) {
        if (mercadoria.getDataCadastro() == null) {
            mercadoria.setDataCadastro(LocalDate.now());
        }
        return repository.save(mercadoria);
    }

    public List<Mercadoria> listarTodos() {
        return repository.findAll();
    }

    public List<Mercadoria> listarPorFornecedor(String fornecedor) {
        return repository.findByFornecedor(fornecedor);
    }

    public Mercadoria atualizar(Long id, Mercadoria mercadoria) {
        mercadoria.setId(id);
        return repository.save(mercadoria);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
