package ie.atu.week3yr4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("Product")
public class Controller {
    private final ProductService productService;

    @Autowired
    public Controller(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/ProductGet")
    public List<Product> getProductList() {
        return productService.getAllProducts();

    }

    @PostMapping("/ProductPost")
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}


