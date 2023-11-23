package javanautas.fakeapius.apiv1.dto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import javanautas.fakeapius.business.FakeApiService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
＠Tag(name="fake-api")public class FakeApiController {

    private final FakeApiService service;
    private final ProdutoService produtoService;

    @Operation(summary = "Busca todos os productos", method = "GET")
    @ApiResponse(value = {
        @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })
    
    ＠PostMapping ("/api")

    public ResponseEntity<List<ProductsDTO>> salvaProdutosApi() {
        return ResponseEntity.ok(service.buscaProdutos());
    }

    @Operation(summary = "Salva novos produtos", method = "POST")
    @ApiResponses(value = {
        @ApiResponses(responseCode = "200", description = "Busca realizada com succeso"),
        @ApiResponses(responseCode = "500", description = "Erro ao realizar busca dos dados"),
    })

    ＠PostMapping ("/api")

    public ResponseEntity<List<ProductsDTO>> salvaProdutosApi() {
        return ResponseEntity.ok(service.buscaProdutos());

    }

}