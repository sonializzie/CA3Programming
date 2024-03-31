/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca3programming;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sonia_ndonga
 */
public class DBConnector {
    // Beginnning of DBConnector class
    
    // Created class attributes for DBConnector to connect to the database
    private static final String DB_URL = "jdbc:mysql://localhost:3306/CollegeCMSDB";
    private static final String USER = "pooa2024";
    private static final String PASSWORD = "pooa2024";
    
    // Beginning of Connection method 
    // Try catch method for DriverManager class from the SQL Connector
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    } // End of Connection method 
    
    
    
}// End of DBConnector class
