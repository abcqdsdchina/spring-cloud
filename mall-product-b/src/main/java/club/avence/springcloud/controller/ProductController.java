package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.service.IProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    @Resource
    private IProductService productService;

    @RequestMapping("/products")
    public List<Product> list() {
        return productService.list();
    }

}
