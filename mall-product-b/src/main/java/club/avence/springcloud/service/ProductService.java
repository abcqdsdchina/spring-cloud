package club.avence.springcloud.service;

import club.avence.springcloud.product.Product;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public Product select(Long id) {
        return new Product().setId(2000L).setName("SelectProductB");
    }

    @Override
    public Product post(Product product) {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    @SneakyThrows
    public Product delete(Long id) {
        Thread.sleep(10000);
        if (id == 1) {
            throw new RuntimeException("Oh, my GOD!");
        }
        return new Product().setId(200001L).setName("DeleteProductB");
    }

    @Override
    public List<Product> list() {
        return Arrays.asList(
                new Product().setId(1L).setName("ProductB"),
                new Product().setId(2L).setName("ProductB"),
                new Product().setId(3L).setName("ProductB"));
    }
}
