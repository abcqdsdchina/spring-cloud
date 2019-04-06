package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.product.ProductRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class ProductController {

    @Resource
    private ProductRemoteService productRemoteService;

    @GetMapping("/products")
    public List<Product> list() {
        return productRemoteService.list();
    }

}