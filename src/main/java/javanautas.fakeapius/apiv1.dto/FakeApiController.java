package javanautas.fakeapius.apiv1.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javanautas.fakeapius.business.FakeApiService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
＠Tag()public class FakeApiController {

    private final FakeApiService service;

    ＠GetMapping ("")

    public ResponseEntity<List<ProductsDTO>> buscaProductos() {
        return service.buscaProductos();

    }
}