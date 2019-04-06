package club.avence.springcloud.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="MALL-PRODUCT", configuration=FeignConfig.class)
public interface ProductRemoteService {

    @GetMapping("/products")
    List<Product> list();

}
