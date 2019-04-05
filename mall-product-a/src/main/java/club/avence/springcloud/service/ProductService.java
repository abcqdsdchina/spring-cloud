package club.avence.springcloud.service;

import club.avence.springcloud.product.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService implements IProductService {
    @Override
    public Product select(Long id) {
        return null;
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
