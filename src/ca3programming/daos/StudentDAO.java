/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.daos;

import ca3programming.DBConnector;
import ca3programming.models.Student;
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
public class StudentDAO {
    // Beginning of Student DAO class

    // Created a StudentDAO empty constructor
    public StudentDAO() {
        // Empty Constructor for StudentDAO
    }
    
    
    // Getting all the student constraints from the college database
    // Beginning of getAllStudents Method
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try ( Connection connection = DBConnector.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM students;");
            while (rs.next()) {
                Student student = new Student();
                student.setStudent_id(rs.getString("student_id"));
                student.setStudent_first_name(rs.getString("student_first_name"));
                student.setStudent_last_name(rs.getString("student_last_name"));
                student.setDepartment_name(rs.getString("department_name"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    } // End of getAllStudents Method

    // Beginning of insertStudent method
    public boolean insertStudent(Student student) {
        String query = "INSERT INTO students(student_id, student_first_name, student_last_name, department_name) VALUES(?, ?, ?, ?)";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, student.getStudent_id());
            pstmt.setString(2, student.getStudent_first_name());
            pstmt.setString(3, student.getStudent_last_name());
            pstmt.setString(4, student.getDepartment_name());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    } // End of insertStudent method

    // Beginning of updateStudent method
    public boolean updateStudent(Student student) {
        String query = "UPDATE students SET student_id = ?, student_first_name = ?, student_last_name = ?, department_name = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, student.getStudent_id());
            pstmt.setString(2, student.getStudent_first_name());
            pstmt.setString(3, student.getStudent_last_name());
            pstmt.setString(4, student.getDepartment_name());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }  // End of updateStudent method

    // Beginning of deleteStudent method
    public boolean deleteStudent(int studentId) {
        String query = "DELETE FROM students WHERE id = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, studentId);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }   // End of deleteStudent method
    
    
    
    
    
    
    
    

} // End of StudentDAO class
