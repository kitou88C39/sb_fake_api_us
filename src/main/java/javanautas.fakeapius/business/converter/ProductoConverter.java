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
        .dataInclusao(LocalDateTime.now())
        .build();
  }

  public ProductsDTO toDTO(ProductsEntity entitiy) {
        return ProductsDTO.builder()
        .id(entitiy.getId)
        .nome(entitiy.getNome())
        .categoria(entitiy.getCategpria())
        .descricao(entitiy.getDescricao())
        .preco(entitiy.getPreco())
        .imagem(entitiy.getImagem())
        .build();
  }

}