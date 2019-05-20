package br.com.nogueira4j.test.testapi.services;

import br.com.nogueira4j.test.testapi.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product save(Product product);
}
