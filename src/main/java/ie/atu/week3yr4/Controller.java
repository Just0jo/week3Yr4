package ie.atu.week3yr4;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private final ProductService productService;
    private ProductFeignClient productFeignClient;

    @Autowired
    public Controller(ProductService productService, ProductFeignClient productFeignClient) {
        this.productService = productService;
        this.productFeignClient = productFeignClient;
    }



    @PostMapping("/ProductPost")
    public String addProduct(@RequestBody @Valid Product product) {
        String ProductGet = productFeignClient.productDetails(product);
        return ProductGet;
    }
}


