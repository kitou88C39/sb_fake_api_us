package javanautas.fakeapius.business;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FakeApiService {
    private final FakeApiClient client;

    public List<ProductsDTO> buscaListaProducts(){
        return cliente.buscaListaProductos();
    }

}