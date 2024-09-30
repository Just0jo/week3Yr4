package ie.atu.week3yr4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "product-service", url = "http://localhost:8081")

public interface FeignClients {
    @PostMapping("/Product")
    String productDetails(@RequestBody Product product);
}
