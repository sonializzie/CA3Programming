/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.daos;

import ca3programming.DBConnector;
import ca3programming.models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonia_ndonga
 */
public class UsersDAO {
    // Beginning of UsersDAO class

    // Created a UsersDAO empty constructor 
    public UsersDAO() {
        // Empty Constructor for CourseDAO
    }

    // Getting all the users constraints from the college database
    // Beginning of getAllUsers Method
    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<>();

        try ( Connection connection = DBConnector.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users;");
            while (rs.next()) {
                Users user = new Users();
                user.setUser_id(rs.getInt("user_id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("role"));
                user.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users; // Returning users
    }  // End of getAllUsers Method

    // Beginning of insertUsers method
    public boolean insertUsers(Users user) {
        String query = "INSERT INTO users(user_id, username, password, email, role) VALUES(?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, user.getUser_id());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getRole());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    } // End of insertUsers method

    // Beginning of updateUsers method
    public boolean updateUsers(Users user) {
        String query = "UPDATE users SET user_id = ?, username = ?, password = ?, email = ?, role = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, user.getUser_id());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getRole());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }  // End of updateUsers method

    // Beginning of deleteUsers method
    public boolean deleteUsers(int userId) {
        String query = "DELETE FROM users WHERE id = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, userId);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }   // End of deleteUsers method

} // End of UsersDAO class
