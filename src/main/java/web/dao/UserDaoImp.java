package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext()
    private EntityManager entityManager;

    @Override
    public List<User> listUsers() {
        TypedQuery<User> query = entityManager.createQuery("select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(findById(user.getId()));
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
}
