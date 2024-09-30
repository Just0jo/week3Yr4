package ie.atu.week3yr4;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getAllProducts() {
        return productList;
    }

    public String addProduct(Product product) {
        productList.add(product);
        return "updated";
    }
}
