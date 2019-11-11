package club.avence.springcloud.product;

import club.avence.springcloud.FeignConfig;
import club.avence.springcloud.product.fallback.ProductRemoteServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author qian3
 */
@FeignClient(name="GATEWAY", configuration=FeignConfig.class, fallbackFactory=ProductRemoteServiceFallbackFactory.class)
public interface ProductRemoteService {

    @GetMapping("/api/mall-product/product/{id}")
    Product get(@PathVariable("id") Long id);

    @GetMapping("/api/mall-product/products")
    List<Product> list();

    @GetMapping("/api/mall-product/product/delete/{id}")
    Product delete(@PathVariable("id") Long id);

}
