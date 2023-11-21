package javanautas.fakeapius.business;

import org.bouncycastle.crypto.RuntimeCryptoException;
import org.springframework.stereotype.Service;

import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import javanautas.fakeapius.infrastructure.repositories.ProductoRepository;
import lombok.RequiredArgsConstructor;

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
}