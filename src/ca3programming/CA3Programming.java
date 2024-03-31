/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca3programming;

import ca3programming.daos.CourseDAO;
import ca3programming.daos.LecturerDAO;
import ca3programming.daos.StudentDAO;
import ca3programming.reports.CourseReportGenerator;
import ca3programming.reports.LecturerReportGenerator;
import ca3programming.reports.StudentReportGenerator;
import java.util.Scanner;

/**
 *
 * @author sonia_ndonga
 */
public class CA3Programming {
    // Beginning of class method

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Beginning of main method

        // Scanner Input
        Scanner scanner = new Scanner(System.in);

        // Prints out welcome display for CMS
        System.out.println("******************************************");
        System.out.println("Welcome to Course Management System.");
        System.out.println("******************************************");

        // Outputting CourseReportGenerator
        CourseDAO courseDAO = new CourseDAO();
        CourseReportGenerator courseReportGenerator = new CourseReportGenerator(courseDAO);
        courseReportGenerator.generateReport();

        // Outputting StudentReportGenerator
        StudentDAO studentDAO = new StudentDAO();
        StudentReportGenerator studentReportGenerator = new StudentReportGenerator(studentDAO);
        studentReportGenerator.generateReport();
        
        // Outputting LecturerReportGenerator
        LecturerDAO lecturerDAO = new LecturerDAO();
        LecturerReportGenerator lecturerReportGenerator = new LecturerReportGenerator(lecturerDAO);
        lecturerReportGenerator.generateReport();

        // Prints out Information Details for CMS
        System.out.println("******************************");
        System.out.println("Information Details to CMS");
        System.out.println("******************************");
        while (true) { // Beginning of while loop
            System.out.println("1. Login\n2. Exit");
            int choice = scanner.nextInt();
            switch (choice) { // Beginning of switch case statement
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            } // End of switch case statement
        } // End of while loop

    } // End of main method

    // Beginning of login method for the course management system
    private static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Here you'd actually check the username and password against the database
        if ("admin".equals(username) && "java".equals(password)) {
            System.out.println("Logged in as admin");
            // Admin functionalities
            // adminMenu Method
            adminMenu();
        } else {
            System.out.println("Invalid credentials");
        }
    }// End of login method

    // Beginning of adminMenu method
    private static void adminMenu() {
        while (true) { // Beginning of while loop
            // Scanner Input
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. Change Password");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Creating a newline

            switch (choice) { // Beginning of switch case statement
                case 1:
                    //addUser();
                    break;
                case 2:
                    //updateUser();
                    break;
                case 3:
                    //deleteUser();
                    break;
                case 4:
                    //changePassword();
                    break;
                case 5:
                    System.out.println("Exiting out the system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            } // End of switch case statement
        } // End of while loop
    }// End of adminMenu method

} // End of class method
