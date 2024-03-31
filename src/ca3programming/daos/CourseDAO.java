/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.daos;

import ca3programming.DBConnector;
import ca3programming.models.Course;
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
public class CourseDAO {
    // Beginning of CourseDAO class

    // Created a CourseDAO empty constructor
    public CourseDAO() {
        // Empty Constructor for CourseDAO
    }

    // Getting all the course constraints from the college database
    // Beginning of getAllCourses Method
    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try ( Connection connection = DBConnector.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM courses;");
            while (rs.next()) {
                Course course = new Course();
                course.setCourse_id(rs.getString("course_id"));
                course.setCourse_name(rs.getString("course_name"));
                course.setDepartment_name(rs.getString("department_name"));
                course.setNo_of_students(rs.getInt("no_of_students"));
                course.setLecturer_id(rs.getString("lecturer_id"));
                courses.add(course);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    } // End of getAllCourses Method

    // Beginning of insertCourse method
    public boolean insertCourse(Course course) {
        String query = "INSERT INTO courses(course_id,course_name, department_name, no_of_students, lecturer_id) VALUES(?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, course.getCourse_id());
            pstmt.setString(2, course.getCourse_name());
            pstmt.setString(3, course.getDepartment_name());
            pstmt.setInt(4, course.getNo_of_students());
            pstmt.setString(5, course.getLecturer_id());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    } // End of insertCourse method

    // Beginning of updateCourse method
    public boolean updateCourse(Course course) {
        String query = "UPDATE courses SET course_id = ?, course_name = ?, department_name = ?, no_of_students = ?, lecturer_id = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, course.getCourse_id());
            pstmt.setString(2, course.getCourse_name());
            pstmt.setString(3, course.getDepartment_name());
            pstmt.setInt(4, course.getNo_of_students());
            pstmt.setString(5, course.getLecturer_id());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }  // End of updateCourse method

    // Beginning of deleteCourse method
    public boolean deleteCourse(int courseId) {
        String query = "DELETE FROM courses WHERE id = ?";
        try ( Connection conn = DBConnector.getConnection();  PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, courseId);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }   // End of deleteCourse method

} // End of CourseDAO class
