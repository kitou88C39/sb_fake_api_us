package javanautas.fakeapius.business.converter;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.infrastructure.entities.ProductoEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class ProdutoConverter {

      public ProdutoEntity toEntity(ProductsDTO dto) {
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

      public ProdutoEntity toEntityUpdate(ProdutoEntity entity, ProductsDTO dto, String id) {
            return ProdutoEntity.builder()
                        .id(id)
                        .nome(dto.getNome() != null ? dto.getNome() : entity.getNome())
                        .categoria(dto.getCategpria() != null ? dto.getCategpria() : entity.getCategpria())
                        .descricao(dto.getDescricao() != null ? dto.getDescricao() : entity.getDescricao())
                        .preco(dto.getPreco() != null ? dto.getPreco() : entity.getPreco())
                        .imagem(dto.getImagem() != null ? dto.getImagem() : entity.getImagem())
                        .dataInclusao(entity.getDataInclusao())
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