package club.avence.springcloud.service;

import club.avence.springcloud.product.Product;

import java.util.List;

public interface IProductService {
    Product select(Long id);
    Product post(Product product);
    Product save(Product product);
    List<Product> list();
}
