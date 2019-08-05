package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qian3
 */
@Slf4j
@RestController
public class ProductController {

    private static final String PRODUCTS_LIST_URL = "http://MALL-PRODUCT/products";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/products")
    public List<Product> list() {
        log.info("serviceInstance={}", loadBalancerClient.choose("MALL-PRODUCT"));
        return restTemplate.exchange(PRODUCTS_LIST_URL, HttpMethod.GET,
                    new HttpEntity<>(httpHeaders), List.class)
                .getBody();
    }

}
