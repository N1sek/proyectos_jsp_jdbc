package org.iesvdm.proyectos_jsp_jdbc.dao;

import org.iesvdm.proyectos_jsp_jdbc.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl extends AbstractDAOImpl implements UserDAO {

    @Override
    public void create(User user) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSet rsGenKeys = null;

        try{
            conn = connectDB();

            ps = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

            int idx = 1;
            ps.setString(idx++, user.getUsername());
            ps.setString(idx, user.getPassword());

            int rows = ps.executeUpdate();
            if (rows == 0){
                System.out.println("Realizado INSERT con 0 filas insertadas");
            }

            rsGenKeys = ps.getGeneratedKeys();
            if (rsGenKeys.next()){
                user.setUserID(rsGenKeys.getInt(1));
            }

        } catch (SQLException | ClassNotFoundException  e) {
            e.printStackTrace();
        } finally {
            closeDb(conn, ps, rs);
        }
    }

    @Override
    public List<User> getAll() {
        Connection conn = null;
        Statement s = null;
        ResultSet rs = null;

        List<User> listUsers = new ArrayList<>();

        try {
            conn = connectDB();

            // Se utiliza un objeto Statement dado que no hay parámetros en la consulta.
            s = conn.createStatement();

            rs = s.executeQuery("SELECT * FROM users");
            while (rs.next()) {
                User user = new User();

                user.setUserID(rs.getInt("userID"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                listUsers.add(user);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeDb(conn, s, rs);
        }
        return listUsers;

    }

    @Override
    public Optional<User> find(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = connectDB();

            ps = conn.prepareStatement("SELECT * FROM users WHERE users.userID = ?");

            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                User user = new User();

                user.setUserID(rs.getInt("userID"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                return Optional.of(user);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeDb(conn, ps, rs);
        }

        return Optional.empty();

    }

    @Override
    public Optional<User> findByName(String username) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = connectDB();

            ps = conn.prepareStatement("SELECT * FROM users WHERE users.username = ?");

            ps.setString(1, username);

            rs = ps.executeQuery();

            if (rs.next()) {
                User user = new User();

                user.setUserID(rs.getInt("userID"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

                return Optional.of(user);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeDb(conn, ps, rs);
        }

        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
