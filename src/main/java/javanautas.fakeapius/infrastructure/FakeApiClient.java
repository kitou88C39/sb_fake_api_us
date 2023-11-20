package javanautas.fakeapius.infrastructure;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public class FakeApiClient {

}
