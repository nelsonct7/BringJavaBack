package com.student.main;

import com.student.dao.StudentDAO;
import com.student.model.Student;

public class Main {
    public static void main(String[] args) {
        
        // 1. Create a student object (Note: we don't set ID, the DB does that)
        Student newStudent = new Student("John", "Doe", "john.doe@example.com", "Computer Science");
        
        // 2. Create the DAO
        StudentDAO studentDao = new StudentDAO();
        
        // 3. Call the insert method
        studentDao.insertStudent(newStudent);
    }
}