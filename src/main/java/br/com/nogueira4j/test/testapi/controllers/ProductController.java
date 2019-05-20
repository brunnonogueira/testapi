package br.com.nogueira4j.test.testapi.controllers;

import br.com.nogueira4j.test.testapi.model.Product;
import br.com.nogueira4j.test.testapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.findAll();
    }

    @PostMapping
    public Product saveProduct(Product product) {
        return productService.save(product);
    }
}
