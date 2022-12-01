package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public void create(User user);

    public User show(long id);

    public List<User> getList();

    public void update(long id, User user);

    public void delete(long id);

    public void delete(User user);

    public List<User> find(User user);
}
