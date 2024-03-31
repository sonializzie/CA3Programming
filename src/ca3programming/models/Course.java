/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.models;

/**
 *
 * @author sonia_ndonga
 */
public class Course {
    // Beginning of class method for Course 
    
    // Created a class attribute for Course
    private String course_id;
    private String course_name;
    private String department_name;
    private int no_of_students;
    private String lecturer_id;
    
    private enum course_room{
        Room_1, Room_2, Room_3, Room_4, Online;
    }
    
    // Created a Course empty constructor
    public Course(){
        //Empty Constructor
    }
    
    // Created a Course default constructor
    public Course(String course_id, String course_name, String department_name, int no_of_students, String lecturer_id) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.department_name = department_name;
        this.no_of_students = no_of_students;
        this.lecturer_id = lecturer_id;
    }

    // Generated Getters and Setters for the Course attributes 
    
    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
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

    public int getNo_of_students() {
        return no_of_students;
    }

    public void setNo_of_students(int no_of_students) {
        this.no_of_students = no_of_students;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }
    
    
    
    
    
    
}// End of class method for Course
