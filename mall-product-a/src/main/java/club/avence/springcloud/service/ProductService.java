package club.avence.springcloud.service;

import club.avence.springcloud.product.Product;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    @SneakyThrows
    public Product select(Long id) {
        if (id == 1) {
            throw new RuntimeException("Oh, my god!");
        }
        return new Product().setId(1000L).setName("ProductAwesome");
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
    public List<Product> list() {
        return Arrays.asList(
                new Product().setId(1L).setName("ProductA"),
                new Product().setId(2L).setName("ProductA"),
                new Product().setId(3L).setName("ProductA")
        );
    }
}
