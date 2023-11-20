package javanautas.fakeapius.apiv1.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javanautas.fakeapius.business.FakeApiService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/productos")
@RequiredArgsConstructor
public class FakeApiController {

    private final FakeApiService service;

}