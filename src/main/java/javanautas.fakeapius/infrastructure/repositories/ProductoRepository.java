package javanautas.fakeapius.infrastructure.repositories;

import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import org.springframework.data.jpa.repositories.JpaRepository;
import org.springframework.stereotype.Repository;

＠Repository

public interface ProductoRepository extends JpaRepository<ProductoEntity, String> {

}