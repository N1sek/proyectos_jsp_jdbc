package org.iesvdm.proyectos_jsp_jdbc.dao;

import org.iesvdm.proyectos_jsp_jdbc.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    public void create(User user);

    public List<User> getAll();
    public Optional<User> find(int id);
    public Optional<User> findByName(String username);

    public void update(User user);
    public void delete(int id);
}
