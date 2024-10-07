package ie.atu.week3yr4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@FeignClient(name = "product-service", url = "http://localhost:8082")
public interface ProductFeignClient {
    @PostMapping("/ProductGet")
    String productDetails(@RequestBody Product product);


}