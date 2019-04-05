package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductController {

    private static final String PRODUCTS_LIST_URL = "http://MALL-PRODUCT/products";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/products")
    public List<Product> list() {
        return restTemplate.exchange(PRODUCTS_LIST_URL, HttpMethod.GET,
                    new HttpEntity<>(httpHeaders), List.class)
                .getBody();
    }

}
