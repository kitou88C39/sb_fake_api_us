package javanautas.fakeapius.infrastructure.repositories;

import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

＠Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, String> {
    
    Boolean  existsByNome(String nome);

    ProdutoEntity findByNome(String nome);

    void deleteByNome(String nome);
}