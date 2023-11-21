package javanautas.fakeapius.business.converter;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ProdutoConverter {

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

      public ProductsDTO toDTO(ProdutoEntity entitiy) {
            return ProductsDTO.builder()
                        .entityId(entitiy.getId)
                        .nome(entitiy.getNome())
                        .categoria(entitiy.getCategpria())
                        .descricao(entitiy.getDescricao())
                        .preco(entitiy.getPreco())
                        .imagem(entitiy.getImagem())
                        .build();
      }

      public List<ProductsDTO> toListDTO(List<ProdutoEntity> entityList) {
            return entityList.stream().map(this::toDTO).toList();

      }
}