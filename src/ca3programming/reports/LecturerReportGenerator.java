/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming.reports;

import ca3programming.daos.LecturerDAO;
import ca3programming.models.Lecturer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonia_ndonga
 */
public class LecturerReportGenerator implements ReportGenerator {
    // Beginning of LecturerReportGenerator class

    // Attributes for LecturerDAO
    private final LecturerDAO lecturerDAO;

    // LecturerReportGenerator method
    public LecturerReportGenerator(LecturerDAO lecturerDAO) {
        this.lecturerDAO = lecturerDAO;
    }

    @Override
    public List<String> generateReport() {
        List<Lecturer> lecturers = lecturerDAO.getAllLecturers();
        List<String> reportLines = new ArrayList<>();
        System.out.println("-----------------------------------");
        System.out.println("Lecturer Report: ");
        System.out.println("-----------------------------------");
        for (Lecturer lecturer : lecturers) {
            System.out.println("Lecturer ID: " + lecturer.getLecturer_id());
            System.out.println("Lecturer First Name: " + lecturer.getLecturer_first_name());
            System.out.println("Lecturer Last Name: " + lecturer.getLecturer_last_name());
            System.out.println("Role: " + lecturer.getRole());
            System.out.println("Course Name: " + lecturer.getCourse_name());
            System.out.println("Department Name: " + lecturer.getDepartment_name());
            System.out.println("No of Students: " + lecturer.getNo_of_students());
            System.out.println("Types of Classes: " + lecturer.getTypes_of_classes());
            System.out.println("-----------------------------------");
        }

        return reportLines; // Return reportLines
    }

} // End of LecturerReportGenerator class
