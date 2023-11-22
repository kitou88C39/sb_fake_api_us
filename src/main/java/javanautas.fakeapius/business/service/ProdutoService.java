package javanautas.fakeapius.business;

import org.bouncycastle.crypto.RuntimeCryptoException;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import javanautas.fakeapius.infrastructure.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private ProductoRepository repository;

    public ProductoEntity salvaProductos(ProductoEntity entity) {
        try {
            return repository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salver Productos" + e);
        }
    }

    public List<ProdutoEntity> buscaTodosProductos() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todos os productos" + e);
        }
    }

    public ProductoEntity buscaProdutoPorNome(String nome) {
        try {
            return repository.findByNome(nome);
        } catch (Exception e) {
            throw new RuntimeException(format("Erro ao buscar producto par nome", nome), e);
        }
    }

    public void deletaProduto(String nome) {
        try {
            repository.deleteByNome(nome);
        } catch (Exception e) {
            throw new RuntimeException(format("Erro ao delete producto par nome", nome), e);
        }
    }

    public Boolean existsPorNome(String nome) {
        try {
            return repository.existsByNome(nome);
        } catch (Exception e) {
            throw new RuntimeException(format("Erro ao buscar producto par nome", nome), e);
        }
    }
}