package javanautas.fakeapius.business;

import javanautas.fakeapius.apiv1.dto.ProductsDTO;
import javanautas.fakeapius.infrastructure.cliente.FakeApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FakeApiService {
    private final FakeApiClient cliente;

    public List<ProductsDTO> buscaListaProducts() {
        List<ProductsDTO> dto = cliente.buscaListaProductos();
        dto.forEach();
    }
}