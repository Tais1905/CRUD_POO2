package estoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import estoque.model.Mercadoria;
import estoque.repository.MercadoriaRepository;

@Service
public class MercadoriaService {

    private final MercadoriaRepository mercadoriaRepository;

    public MercadoriaService(MercadoriaRepository mercadoriaRepository) {
        this.mercadoriaRepository = mercadoriaRepository;
    }

    public Mercadoria salvar(Mercadoria mercadoria) {
        return mercadoriaRepository.save(mercadoria);
    }

    public List<Mercadoria> listar() {
        return mercadoriaRepository.findByQuantidadeGreaterThan(0);
    }

    public Mercadoria buscarPorId(Long id) {
        return mercadoriaRepository.findById(id).orElse(null);
    }

    public Mercadoria editar(Long id, Mercadoria novaMercadoria) {

        Mercadoria mercadoria = buscarPorId(id);

        if (mercadoria == null) {
            return null;
        }

        mercadoria.setNome(novaMercadoria.getNome());
        mercadoria.setDescricao(novaMercadoria.getDescricao());
        mercadoria.setDataValidade(novaMercadoria.getDataValidade());
        mercadoria.setDataCadastro(novaMercadoria.getDataCadastro());
        mercadoria.setFornecedor(novaMercadoria.getFornecedor());
        mercadoria.setQuantidade(novaMercadoria.getQuantidade());

        return mercadoriaRepository.save(mercadoria);
    }

    public void deletar(Long id) {
        mercadoriaRepository.deleteById(id);
    }
}