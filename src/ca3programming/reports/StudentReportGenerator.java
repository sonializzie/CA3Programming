/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.reports;

import ca3programming.daos.StudentDAO;
import ca3programming.models.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonia_ndonga
 */
public class StudentReportGenerator implements ReportGenerator {
    // Beginning of StudentReportGenerator class
    
    // Attributes for StudentDAO
    private final StudentDAO studentDAO;

    // CourseReportGenerator method
    public StudentReportGenerator(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
    
    @Override
    public List<String> generateReport() {
        List<Student> students = studentDAO.getAllStudents();
        List<String> reportLines = new ArrayList<>();
        System.out.println("-----------------------------------");
        System.out.println("Student Report: ");
        System.out.println("-----------------------------------");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudent_id());
            System.out.println("Student First Name: " + student.getStudent_first_name());
            System.out.println("Student Last Name: " + student.getStudent_last_name());
            System.out.println("Department Name: " + student.getDepartment_name());
            System.out.println("-----------------------------------");
        }

        return reportLines; // return ReportLines
    }
    
    
    
    
}// End of StudentReportGenerator class
