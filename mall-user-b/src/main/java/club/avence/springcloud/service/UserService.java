package club.avence.springcloud.service;

import club.avence.springcloud.user.User;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    @SneakyThrows
    public User select(Long id) {
        return new User().setId(1000L).setName("UserAwesome");
    }

    @Override
    public User post(User product) {
        return null;
    }

    @Override
    public User save(User product) {
        return null;
    }

    @Override
    @SneakyThrows
    public User delete(Long id) {
        return new User().setId(100001L).setName("UserDeleteA");
    }

    @Override
    public List<User> list() {
        return Arrays.asList(
                new User().setId(1L).setName("UserA"),
                new User().setId(2L).setName("UserA"),
                new User().setId(3L).setName("UserA")
        );
    }
}
