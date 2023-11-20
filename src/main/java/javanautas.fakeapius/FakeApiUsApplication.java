package javanautas.fakeapius;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FakeApiUsApplication {
    public static void main(String[] org) {
        SpringApplication.run(FakeApiUsApplication.class, args);
    }

}
