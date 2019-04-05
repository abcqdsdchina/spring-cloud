package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    private static final String PRODUCT_LIST_URL = "http://localhost:8085/products";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/products")
    public List<Product> list() {
        return restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
    }

}
