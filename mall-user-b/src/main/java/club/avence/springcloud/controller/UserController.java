package club.avence.springcloud.controller;

import club.avence.springcloud.service.IUserService;
import club.avence.springcloud.user.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/user/{id}")
    @HystrixCommand(fallbackMethod="getFallback")
    public User get(@PathVariable("id") Long id) {
        return userService.select(id);
    }

    public User getFallback(Long id) {
        return new User().setId(0L).setName("Hystrix 降级用户");
    }

    @GetMapping("/users")
    @HystrixCommand(fallbackMethod="listFallback")
    public List<User> list() {
        return userService.list();
    }

    public List<User> listFallback() {
        return Arrays.asList(new User().setId(0L).setName("USER-A HYSTRIX FALLBACK"));
    }

}
