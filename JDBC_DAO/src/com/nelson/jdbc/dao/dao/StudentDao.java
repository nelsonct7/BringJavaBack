package com.nelson.jdbc.dao.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nelson.jdbc.dao.DbConnection;
import com.nelson.jdbc.dao.schema.StudentSchema;

public class StudentDao {
    DbConnection dbConObj=null;
    
    public StudentDao(DbConnection dbConObj) {
	this.dbConObj=dbConObj;	
    }
    
    public void insertStudent(StudentSchema std){
	try {
	    String query="insert into students values (?,?,?,?,?)";
	    PreparedStatement pst=this.dbConObj.getConnectionObj().prepareStatement(query);
	    pst.setInt(1, std.getId());
	    pst.setString(2, std.getFirstName());
	    pst.setString(3,std.getLastName());
	    pst.setString(4, std.getEmail());
	    pst.setString(5, std.getCourse());
	    int result=pst.executeUpdate();
	    if(result>0) {
		System.out.println("New student with email "+std.getEmail()+" added to system");
	    }
	}catch(Exception ex) {
	    System.err.println("Failed to add new Student");
	    ex.printStackTrace();
	}
    }

    public StudentSchema getUserByEmail(String email) {
	try {
	    String query="Select * from students where email=?";
		PreparedStatement pst=this.dbConObj.getConnectionObj().prepareStatement(query);	
		pst.setString(1,email);
		ResultSet rs=pst.executeQuery();
		if(rs.next()) {
		    StudentSchema std=new StudentSchema(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5	));
		    return std;
		}
		
	}catch(Exception ex) {
	    System.err.println("Failed to fetch user");
	    ex.printStackTrace();
	}
	return null;
    }
    
    public StudentSchema updateStudentCourseByEmail(String email,String newCourse) {
	try {
	StudentSchema ref=this.getUserByEmail(email);
	if(ref==null) {
	    System.out.println("The requested user is not found, please check the email submitted");
	    return null;
	}
	String updateQuery =
		    "UPDATE students SET course = ? WHERE email = ?";

		PreparedStatement ps = this.dbConObj.getConnectionObj().prepareStatement(updateQuery);
		ps.setString(1, newCourse);
		ps.setString(2, email);

		int rowsUpdated = ps.executeUpdate();

		if (rowsUpdated > 0) {
		    System.out.println("Course updated successfully");
		    ref=this.getUserByEmail(email);
		}
		return ref;
	}catch(Exception e) {
	    System.err.println("Failed to update the user  course");
	    e.printStackTrace();
	}					
	return null;
    }
    
    public void deleteStudentEntryByEmail(String email) {
	try {
	   StudentSchema ref=this.getUserByEmail(email);
	   if(ref==null) {
	       System.out.println("The user does not exist in the system, or user might have already deleted");
	       return;
	   }
	   String deleteQuery = "DELETE FROM students WHERE email = ?";

		PreparedStatement ps = this.dbConObj.getConnectionObj().prepareStatement(deleteQuery);
		ps.setString(1, email);

		int rowsDeleted = ps.executeUpdate();

		if (rowsDeleted > 0) {
		    System.out.println("Record deleted successfully");
		    return;
		}
		System.out.println("Failed to delete the row, please try again later");
		return;
	}catch(Exception ex) {
	    System.err.println("Failed to delete the user from the system, please try again later");
	    ex.printStackTrace();
	    }
    }
}
