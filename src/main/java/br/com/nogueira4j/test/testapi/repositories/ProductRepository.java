package br.com.nogueira4j.test.testapi.repositories;

import br.com.nogueira4j.test.testapi.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
