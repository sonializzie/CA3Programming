/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.reports;

import ca3programming.daos.CourseDAO;
import ca3programming.models.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonia_ndonga
 */
public class CourseReportGenerator implements ReportGenerator {
    // Beginning of CourseReportGenerator class

    // Attributes for CourseDAO
    private final CourseDAO courseDAO;

    // CourseReportGenerator method
    public CourseReportGenerator(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
    
    @Override
    public List<String> generateReport() {
        List<Course> courses = courseDAO.getAllCourses();
        List<String> reportLines = new ArrayList<>();
        System.out.println("-----------------------------------");
        System.out.println("Course Report: ");
        System.out.println("-----------------------------------");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getCourse_id());
            System.out.println("Course Name: " + course.getCourse_name());
            System.out.println("Department Name: " + course.getDepartment_name());
            System.out.println("Lecturer ID: " + course.getLecturer_id());
            System.out.println("No of Students: " + course.getNo_of_students());
            System.out.println("-----------------------------------");
        }

        return reportLines;
    }

}// End of CourseReportGenerator class
