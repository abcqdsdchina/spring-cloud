package club.avence.springcloud.product.fallback;

import club.avence.springcloud.product.Product;
import club.avence.springcloud.product.ProductRemoteService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @author qian3
 */
@Component
public class ProductRemoteServiceFallbackFactory implements FallbackFactory<ProductRemoteService> {
    @Override
    public ProductRemoteService create(Throwable cause) {
        return new ProductRemoteService() {
            @Override
            public Product get(Long id) {
                return new Product().setId(0L).setName("Hystrix 熔断！");
            }

            @Override
            public List<Product> list() {
                return Collections.singletonList(new Product().setId(0L).setName("Hystrix 熔断！"));
            }

            @Override
            public Product delete(Long id) {
                return new Product().setId(0L).setName("Hystrix 熔断！");
            }
        };
    }
}
