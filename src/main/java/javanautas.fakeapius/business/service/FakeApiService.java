package javanautas.fakeapius.business;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.business.converter.ProductoConverter;
import javanautas.fakeapius.infrastructure.cliente.FakeApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.list;

@Service
@RequiredArgsConstructor
public class FakeApiService {

    private final FakeApiClient cliente;
    private final ProdutoConverter converter;
    private final ProdutoService produtoService;

    public List<ProductsDTO> buscaProdutos() {
        try {

            List<ProductsDTO> dto = cliente.buscaListaProdutos();
            dto.forEach(produto -> {
                Boolean retorno = produtoService.existsPorNome(produto.getNome());
                if (retorno.equals(false)) {
                    produtoService.salvaProdutos(converter.toEntity(produto));
                }
            }

            );
            return converter.toListDTO(produtoService.buscaTodosProductos());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar e gravar produtos no banco dados");
        }
    }
}