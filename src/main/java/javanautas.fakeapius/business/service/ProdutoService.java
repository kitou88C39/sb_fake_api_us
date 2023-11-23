package javanautas.fakeapius.business;

import org.bouncycastle.crypto.RuntimeCryptoException;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.business.converter.ProdutoConverter;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import javanautas.fakeapius.infrastructure.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProdutoRepository repository;
    private final ProdutoConverter converter;

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

    public ProductsDTO updateProduto(String id, ProductsDTO dto) {
        try {
            ProductoEntity entity = repository.findById(id)
                    .orElseThorw(() -> new RuntimeException("Id nao existe no banco de dados"));
            salvaProdutos(converter.toEntityUpdate(entity, dto, id));
            return converter.toDTO(repository.findByNome(entity.getNome()));
        } catch (Exception e) {
            throw new RuntimeException(format("Erro ao atualiza producto"), e);
        }
    }
}
