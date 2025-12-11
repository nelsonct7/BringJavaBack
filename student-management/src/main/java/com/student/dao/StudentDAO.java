package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.student.util.DatabaseConnection;
import com.student.model.Student;

public class StudentDAO {

    // 1. Define the SQL string with ? as placeholders
    private static final String INSERT_STUDENT_SQL = "INSERT INTO students (first_name, last_name, email, course) VALUES (?, ?, ?, ?)";

    public void insertStudent(Student student) {
        // Try-with-resources: This automatically closes the connection when done
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)) {
            
            // 2. Fill in the placeholders (?)
            preparedStatement.setString(1, student.getFirstName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getCourse());

            // 3. Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}