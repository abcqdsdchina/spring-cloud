package club.avence.springcloud.controller;

import club.avence.springcloud.user.User;
import club.avence.springcloud.user.UserRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserRemoteService userRemoteService;

    @GetMapping("/users")
    public List<User> list() {
        return userRemoteService.list();
    }

}
