package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    void insert(User user) throws SQLException;
    List<User> findAll() throws SQLException;
    User findById(int id) throws SQLException;
    boolean delete(int id) throws SQLException;
    boolean update(User user) throws SQLException;
    List<User> sortByType(String type) throws SQLException;
    List<User> searchUser(String name,String country) throws SQLException;
}
