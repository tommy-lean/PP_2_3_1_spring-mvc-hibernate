package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();

    void add(User user);
    void delete(User user);

    void update(User user);
    User findById(Long id);
}
