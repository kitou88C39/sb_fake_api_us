package javanautas.fakeapius.business.converter;


import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ProductoConverter {

    public ProductoEntity toEntity(ProductsDTO dto) {
        return ProductoEntity.builder()
        .id(String.valueOf(UUID.randomUUID()))
        .nome(dto.getNome())
        .categoria(dto.getCategpria())
        .descricao(dto.getDescricao())
        .preco(dto.getPreco())
        .imagem(dto.getImagem())
        .dataInclusao(dto.getDataInclusao())
        .build(dto.getBuild())
  }
}