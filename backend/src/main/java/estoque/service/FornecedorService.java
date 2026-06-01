package main.java.estoque.service;

import java.util.List;
import org.springframework.stereotype.Service;
import estoque.model.Fornecedor;
import estoque.repository.FornecedorRepository;

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

    public Fornecedor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Fornecedor atualizar(Long id, Fornecedor fornecedor) {
        fornecedor.setId(id);
        return repository.save(fornecedor);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}