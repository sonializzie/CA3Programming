/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.models;

/**
 *
 * @author sonia_ndonga
 */
public class Student {
    // Beginning of class method for Student 

    // Created a class attribute for Student 
    private String student_id;
    private String student_first_name;
    private String student_last_name;
    private String department_name;

    // Create a Student empty construtor
    public Student() {
        // Empty Constructor
    }

    // Created a Student default constructor 
    public Student(String student_id, String student_first_name, String student_last_name, String department_name) {
        this.student_id = student_id;
        this.student_first_name = student_first_name;
        this.student_last_name = student_last_name;
        this.department_name = department_name;
    }
    
    // Generated Getters and Setters for the Course attributes 
    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_first_name() {
        return student_first_name;
    }

    public void setStudent_first_name(String student_first_name) {
        this.student_first_name = student_first_name;
    }

    public String getStudent_last_name() {
        return student_last_name;
    }

    public void setStudent_last_name(String student_last_name) {
        this.student_last_name = student_last_name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    

}// End of class method for Student
