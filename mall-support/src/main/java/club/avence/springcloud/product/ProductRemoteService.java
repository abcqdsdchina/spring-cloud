package club.avence.springcloud.product;

import club.avence.springcloud.FeignConfig;
import club.avence.springcloud.product.fallback.ProductRemoteServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="MALL-PRODUCT", configuration=FeignConfig.class, fallbackFactory=ProductRemoteServiceFallbackFactory.class)
public interface ProductRemoteService {

    @GetMapping("/product/{id}")
    Product get(@PathVariable("id") Long id);

    @GetMapping("/products")
    List<Product> list();

    @GetMapping("/product/delete/{id}")
    Product delete(@PathVariable("id") Long id);

}
