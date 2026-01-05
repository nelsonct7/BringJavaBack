	
	package com.student.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DatabaseConnection {

	    // Postgres runs on port 5432 by default
	    private static final String URL = "jdbc:postgresql://localhost:5432/student_db";
	    private static final String USER = "postgres"; 
	    private static final String PASSWORD = "password"; // Update this!

	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            // Load the driver class (sometimes needed for older Java versions, good practice)
	            Class.forName("org.postgresql.Driver");
	            
	            conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connected to PostgreSQL successfully!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn;
	    }
	}

