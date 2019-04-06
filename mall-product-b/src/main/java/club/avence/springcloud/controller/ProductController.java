package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    private IProductService productService;

    @GetMapping("/product/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.select(id);
    }

    @GetMapping("/products")
    public List<Product> list() {
        return productService.list();
    }

}
