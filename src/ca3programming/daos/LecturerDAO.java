/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.daos;

import ca3programming.DBConnector;
import ca3programming.models.Lecturer;
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
public class LecturerDAO {
    // Beginning of LecturerDAO class

    // Created a LecturerDAO empty constructor
    public LecturerDAO() {
        // Empty Constructor for LecturerDAO
    }

    // Getting all the lecturer constraints from the college database
    // Beginning of getAllLecturer Method
    public List<Lecturer> getAllLecturers() {
        List<Lecturer> lecturers = new ArrayList<>();
        try ( Connection connection = DBConnector.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM lecturers;");
            while (rs.next()) {
                Lecturer lecturer = new Lecturer();
                lecturer.setLecturer_id(rs.getString("lecturer_id"));
                lecturer.setLecturer_first_name(rs.getString("lecturer_first_name"));
                lecturer.setLecturer_last_name(rs.getString("lecturer_first_name"));
                lecturer.setRole((String) rs.getString("role"));
                lecturer.setCourse_name(rs.getString("course_name"));
                lecturer.setDepartment_name(rs.getString("department_name"));
                lecturer.setNo_of_students(rs.getInt("no_of_students"));
                lecturer.setTypes_of_classes(rs.getString("types_of_classes"));
                lecturers.add(lecturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lecturers;
    } // End of getAllLecturers Method

    // Beginning of insertLecturer method
    public boolean insertLecturer(Lecturer lecturer) {
        String query = "INSERT INTO lecturers(lecturer_id, lecturer_first_name, lecturer_first_name, role, course_name, department_name, no_of_students, types_of_classes) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, lecturer.getLecturer_id());
            pstmt.setString(2, lecturer.getLecturer_first_name());
            pstmt.setString(3, lecturer.getLecturer_last_name());
            pstmt.setString(4, lecturer.getRole());
            pstmt.setString(5, lecturer.getCourse_name());
            pstmt.setString(6, lecturer.getDepartment_name());
            pstmt.setInt(7, lecturer.getNo_of_students());
            pstmt.setString(8, lecturer.getTypes_of_classes());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    } // End of insertLecturer method

    // Beginning of updateLecturer method
    public boolean updateLecturer(Lecturer lecturer) {
        String query = "UPDATE lecturers SET lecturer_id = ?, lecturer_first_name = ?, lecturer_last_name = ?, role = ?, course_name = ?, department_name = ?, no_of_students = ?, types_of_classes = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, lecturer.getLecturer_id());
            pstmt.setString(2, lecturer.getLecturer_first_name());
            pstmt.setString(3, lecturer.getLecturer_last_name());
            pstmt.setString(4, lecturer.getRole());
            pstmt.setString(5, lecturer.getCourse_name());
            pstmt.setString(6, lecturer.getDepartment_name());
            pstmt.setInt(7, lecturer.getNo_of_students());
            pstmt.setString(8, lecturer.getTypes_of_classes());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }  // End of updateLecturer method

    // Beginning of deleteLecturer method
    public boolean deleteLecturer(int lecturerId) {
        String query = "DELETE FROM lecturers WHERE id = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, lecturerId);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }   // End of deleteLecturer method

}// End of LecturerDAO class
