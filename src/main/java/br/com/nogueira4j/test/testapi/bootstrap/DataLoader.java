package br.com.nogueira4j.test.testapi.bootstrap;

import br.com.nogueira4j.test.testapi.model.Product;
import br.com.nogueira4j.test.testapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductService productService;

    @Autowired
    public DataLoader(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = productService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Product product1 = new Product();
        product1.setDescription("Bean");
        product1.setWeight(18.0);

        productService.save(product1);

        Product product2 = new Product();
        product2.setDescription("Rice");
        product2.setWeight(15.0);

        productService.save(product2);
    }
}