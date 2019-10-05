package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.service.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author qian3
 */
@RestController
public class ProductController {

    @Resource
    private IProductService productService;

    @GetMapping("/product/{id}")
    @HystrixCommand(fallbackMethod="getFallback")
    public Product get(@PathVariable("id") Long id) {
        return productService.select(id);
    }

    public Product getFallback(Long id) {
        return new Product().setId(id).setName("Hystrix 降级产品");
    }

    @GetMapping("/products")
    @HystrixCommand(fallbackMethod="listFallback")
    public List<Product> list() {
        return productService.list();
    }

    public List<Product> listFallback() {
        return Collections.singletonList(new Product().setId(0L).setName("PRODUCT-A HYSTRIX FALLBACK"));
    }

    @GetMapping("/product/delete/{id}")
    public Product delete(@PathVariable("id") Long id) {
        return productService.delete(id);
    }

}
