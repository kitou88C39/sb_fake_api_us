package javanautas.fakeapius.apiv1.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javanautas.fakeapius.business.FakeApiService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
＠Tag(name="fake-api")public class FakeApiController {

    private final FakeApiService service;

    @Operation(summary = "Busca todos os productos", method = "GET")
    @ApiResponse(value = {
        @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    
    ＠GetMapping ("")

    public ResponseEntity<List<ProductsDTO>> buscaProductos() {
        return ResponseEntity.ok(service.buscaProductos());

    }
}