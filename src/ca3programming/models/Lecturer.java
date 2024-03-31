/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.models;

/**
 *
 * @author sonia_ndonga
 */
public class Lecturer {
    // Beginning of class method for Lecturer 

    // Created a class attribute for Lecturer
    private String lecturer_id;
    private String lecturer_first_name;
    private String lecturer_last_name;
    private String role;
    private String course_name;
    private String department_name;

    // Created a Lecturer empty constructor
    public Lecturer() {
        // Empty Constructor
    }

    // Created a Lecturer default constructor
    public Lecturer(String lecturer_id, String lecturer_first_name, String lecturer_last_name, String role, String course_name, String department_name) {
        this.lecturer_id = lecturer_id;
        this.lecturer_first_name = lecturer_first_name;
        this.lecturer_last_name = lecturer_last_name;
        this.role = role;
        this.course_name = course_name;
        this.department_name = department_name;
    }

    // Generated Getters and Setters for the Lecturer attributes 
    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getLecturer_first_name() {
        return lecturer_first_name;
    }

    public void setLecturer_first_name(String lecturer_first_name) {
        this.lecturer_first_name = lecturer_first_name;
    }

    public String getLecturer_last_name() {
        return lecturer_last_name;
    }

    public void setLecturer_last_name(String lecturer_last_name) {
        this.lecturer_last_name = lecturer_last_name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

} // End of class method for Lecturer 
