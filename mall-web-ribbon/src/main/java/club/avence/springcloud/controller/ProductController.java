package club.avence.springcloud.controller;

import club.avence.springcloud.product.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @author qian3
 */
@Slf4j
@RestController
public class ProductController {

    private static final String PRODUCTS_TOPIC = "mall-product";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/products")
    public List<Product> list() {
        ServiceInstance serviceInstance = loadBalancerClient.choose(PRODUCTS_TOPIC);
        URI uri = URI.create(String.format("http://%s:%s/products",
                serviceInstance.getHost(), serviceInstance.getPort()));
        return restTemplate.exchange(uri, HttpMethod.GET,
                    new HttpEntity<>(httpHeaders), List.class)
                .getBody();
    }

}
