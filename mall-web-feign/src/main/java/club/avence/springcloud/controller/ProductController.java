package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.product.ProductRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qian3
 */
@Slf4j
@RestController
public class ProductController {

    @Resource
    private ProductRemoteService productRemoteService;

    @GetMapping("/product/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productRemoteService.get(id);
    }

    @GetMapping("/product/delete/{id}")
    public Product delete(@PathVariable("id") Long id) {
        return productRemoteService.delete(id);
    }

    @GetMapping("/products")
    public List<Product> list() {
        return productRemoteService.list();
    }

}
