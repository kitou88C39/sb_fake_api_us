package javanautas.fakeapius.business.converter;

import java.util.UUID;

import org.springframework.stereotype.Component;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;

@Component
public class ProductoConverter {

    public ProductoEntity toEntity(ProductsDTO dtp){
        return ProductoEntity.builder()
        .id(String.valueOf(UUID.randomUUID()))
        .name(dto.getName())
        

}