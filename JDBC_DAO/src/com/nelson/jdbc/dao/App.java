package com.nelson.jdbc.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.nelson.jdbc.dao.dao.StudentDao;
import com.nelson.jdbc.dao.schema.StudentSchema;

public class App {
    private static int getId(Connection con, BufferedReader br) {
	    String query = "SELECT 1 FROM students WHERE id = ?";

	    while (true) {
	        try {
	            System.out.print("Please enter the id: ");
	            int id = Integer.parseInt(br.readLine());

	            try (PreparedStatement ps = con.prepareStatement(query)) {
	                ps.setInt(1, id);
	                try (ResultSet rs = ps.executeQuery()) {
	                    if (rs.next()) {
	                        System.out.println("Id already exists. Enter a new one.");
	                    } else {	
	                        return id;
	                    }
	                }
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number. Enter a numeric id.");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return -1; // hard failure
	        }
	    }
	}
    
    private static String getStringValue(
	        Connection con,
	        BufferedReader br,
	        String fieldName,
	        boolean mustBeUnique
	) {
	    String query = "SELECT 1 FROM students WHERE " + fieldName + " = ?";

	    while (true) {
	        try {
	            System.out.print("Enter " + fieldName + ": ");
	            String value = br.readLine();

	            if (value == null || value.trim().isEmpty()) {
	                System.out.println(fieldName + " cannot be empty.");
	                continue;
	            }

	            if (!mustBeUnique) {
	                return value;
	            }

	            try (PreparedStatement ps = con.prepareStatement(query)) {
	                ps.setString(1, value);
	                try (ResultSet rs = ps.executeQuery()) {
	                    if (rs.next()) {
	                        System.out.println(fieldName + " already exists. Enter a new one.");
	                    } else {
	                        return value;
	                    }
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "invalid";
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DbConnection db=new DbConnection();
	    Connection con=db.connect();
	    StudentDao stdDao=new StudentDao(db);

	    while(true) {
		try {
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("PLEASE ENTER YOUR CHOICE \n1: Insert new value \n2: View student by email \n3: Update Courses\n4: Delete by email\n 5: Close");
			int choice =Integer.parseInt(br.readLine());
			if (choice == 5) break;
			switch(choice) {
			case 1:{
			    int id = getId(con, br);
			    String firstName = getStringValue(con, br, "first_name", false);
			    String lastName  = getStringValue(con, br, "last_name", false);
			    String email     = getStringValue(con, br, "email", true);
			    String course    = getStringValue(con, br, "course", false);
			 StudentSchema stdObj=new StudentSchema(id, firstName, lastName, email, course	);
			 stdDao.insertStudent(stdObj);
			 break;
			}
			case 2:{
			    String email     = getStringValue(con, br, "email", false);
			    StudentSchema ref= stdDao.getUserByEmail(email);
			    if(ref==null) {
				System.out.println("Requested user not found");
				break;
			    }
			    System.out.println("userId "+ref.getId()+", email "+ref.getEmail()+", course "+ref.getCourse());
			    break;
			}
			case 3:{
			    String email     = getStringValue(con, br, "email", false);
			    String newCourse=getStringValue(con, br, "course", false);
			    StudentSchema ref= stdDao.updateStudentCourseByEmail(email,newCourse);
			    System.out.println("User "+ref.getEmail()+" updated with course "+ref.getCourse());
			    break;
			}
			case 4:{
			    String email     = getStringValue(con, br, "email", false);
			    stdDao.deleteStudentEntryByEmail(email);
			    break;
			}
			default:{
			    System.out.println("Please enter a valid choice");
			    break;	
			}
			}
		}catch(Exception ex) {
		    System.err.println("Failed to initate the system");
		    ex.printStackTrace();
		}
		
	    }
	}

}
