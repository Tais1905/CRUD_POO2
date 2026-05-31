package estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estoque.model.Mercadoria;
import java.util.List;

@Repository
public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {
    List<Mercadoria> findByQuantidadeGreaterThan(Integer quantidade);
}
