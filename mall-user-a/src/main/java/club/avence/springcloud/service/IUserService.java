package club.avence.springcloud.service;

import club.avence.springcloud.user.User;

import java.util.List;

public interface IUserService {
    User select(Long id);
    User post(User product);
    User save(User product);
    User delete(Long id);
    List<User> list();
}
