package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        /String res = "CREATE TABLE IF NOT EXISTS user " +
                "(id BIGINT PRIMARY KEY AUTO_INCREMENT, firstName CHAR(40), lastName CHAR(40), age TINYINT)";
        try(final Connection connection = Util.getConnection();
            Statement statement = connection.createStatement()) {
            statement.execute(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void dropUsersTable() {
        String res = "DROP TABLE IF EXISTS user";
        try(final Connection connection = Util.getConnection();
            Statement statement = connection.createStatement()) {
            statement.execute(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        String res = "INSERT INTO user (firstName, lastName, age) VALUES(?, ?, ?)";
        try (final Connection connection = Util.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(res)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeUserById(long id) {
        String res = "DELETE FROM user WHERE id = ?";
        try (final Connection connection = Util.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(res)) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<User> getAllUsers() {
        String res = "SELECT * FROM user";
        List<User> list = new ArrayList<>();
        try (Connection connection = Util.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(res)) {
            ResultSet result = preparedStatement.executeQuery();
            while(result.next()) {
                User user = new User();
                user.setId(result.getLong("id"));
                user.setName(result.getString("firstName"));
                user.setLastName(result.getString("lastName"));
                user.setAge(result.getByte("age"));
                list.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void cleanUsersTable() {
        String res = "TRUNCATE TABLE user";
        try (Connection connection = Util.getConnection();
             Statement statement = connection.createStatement()) {
            statement.execute(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}*/