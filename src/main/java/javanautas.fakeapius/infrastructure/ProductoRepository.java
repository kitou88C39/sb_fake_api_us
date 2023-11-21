package javanautas.fakeapius.infrastructure;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.stereotype.Repository;

＠Repository
public class ProductoRepository extends JpaProperties<ProductoEntity, String>{
    
}