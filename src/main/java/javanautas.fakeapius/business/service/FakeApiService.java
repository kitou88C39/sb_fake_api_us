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
    private final ProductoConverter converter;
    private final ProdutoService productoservice;

    public List<ProductsDTO> buscaListaProducts() {
        List<ProductsDTO> dto = cliente.buscaListaProductos();
        dto.forEach();
    }
}