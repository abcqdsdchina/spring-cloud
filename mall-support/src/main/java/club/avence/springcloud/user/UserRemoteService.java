package club.avence.springcloud.user;

import club.avence.springcloud.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="ZUUL", configuration=FeignConfig.class)
public interface UserRemoteService {

    @GetMapping("/api/mall-user/users")
    List<User> list();

}
