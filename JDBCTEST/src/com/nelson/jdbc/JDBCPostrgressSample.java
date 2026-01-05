package com.nelson.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPostrgressSample {
	private final String url="jdbc:postgresql://localhost/student_db";
	private final String user="postgres";
	private final String password="password";
	    private Connection connect() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Db connected successfully");
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	 // this recursive operation is bad due to memory leak and other issues, todo:fix this
	private int getId(Statement st,BufferedReader br) {
		try {
			System.out.println("Please enter the id ");
			int id=Integer.parseInt(br.readLine());
			String validateIdQuery="SELECT * FROM students WHERE id='"+id+"'";
			ResultSet idCheck=st.executeQuery(validateIdQuery);
			if(idCheck.next()) {
				System.out.println("Id not available please enter new one");
				return this.getId(st, br);
			}
			return id;
		}catch(Exception e) {
			System.out.println("Error at id fetch");
			e.printStackTrace();
		}
		return -1;
	}
	// this recursive operation is bad due to memory leak and other issues, todo:fix this
	private String getStringValue(Statement st,String key){
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the value for "+key);
			String value =br.readLine();
			if(key.equals("email")) {
				// sql injection prone usage, todo : change to prepare statement
				String validateUniqueEmail="SELECT * FROM students WHERE email='"+value+"'";
				ResultSet emailExist=st.executeQuery(validateUniqueEmail);
				if(emailExist.next()) {
					System.out.println("This email is already used, please enter a new one");
					return this.getStringValue(st, key);
				}
				
			}
			return value;
		}catch(Exception e) {
			System.out.println("Failed to retrieve value for "+key);
			e.printStackTrace();
		}
		return "invalid";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCPostrgressSample dbObj=new JDBCPostrgressSample();
		Connection con=dbObj.connect();
		try {
			Statement st= con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("PLEASE ENTER YOUR CHOICE \n1: Insert new value \n2: View all \n3: Update Courses\n4: Delete by email\n 5: Close");
				int choice =Integer.parseInt(br.readLine());
				if (choice == 5) break;
				switch(choice) {
				case 1:{
					int id = dbObj.getId(st,br);	
					System.out.println("Entered id "+id);
					String firstName=dbObj.getStringValue(st, "first_name");
					System.out.println("Entered firstName "+firstName);
					String lastName=dbObj.getStringValue(st, "last_name");
					System.out.println("Enterd lastName "+lastName);
					String email=dbObj.getStringValue(st, "email");
					System.out.println("Entered email "+email);
					String course=dbObj.getStringValue(st, "course");
					System.out.println("Enterd course "+course);
					String[] verifyArray= {firstName,lastName,email,course};
					System.out.println("values "+verifyArray.toString());
					if(id==-1) {
						System.out.println("Id is not generated unable to insert value in to the table");
						break;
					}
					for(String item : verifyArray) {
						if(item.equals("invalid")) {
							System.out.println("Invalid value is entered in to the field can not insert values in to table");
							break;
						}
					}
					// insert values in to the table
					String insertQuery="INSERT INTO students (\"id\",\"first_name\",\"last_name\",\"email\",\"course\") VALUES ("+id+",'"+firstName+"','"+lastName+"','"+email+"','"+course+"');";
					int rowsEffected=st.executeUpdate(insertQuery);
					if(rowsEffected>0	) {
						System.out.println("Inserted Values in to table ");
					}
					break;
				}
				case 2:{
					// select all values in the table	
					String selectAllQuery="SELECT * FROM students";
					ResultSet rs=st.executeQuery(selectAllQuery);
					while(rs.next()) {
						System.out.println("\nId"+rs.getInt(1)+" FirstName "+rs.getString(2)+" LastName "+rs.getString(3)+" email "+rs.getString(4)+" courses "+rs.getString(5));
					}
					break;
				}
				case 3:{
					System.out.println("Enter the email you want to update");
					String email=br.readLine();
					String verifyEmailExist="SELECT * FROM students WHERE email='"+email+"'";
					ResultSet emailVerify=st.executeQuery(verifyEmailExist);
					if(!emailVerify.next()) {
						System.out.println("The requested email is not found, please verify the email you have entered");
						break;
					}
					System.out.println("Enter the new course you want to add to your profile ");
					String newCourse=br.readLine();
					String updateQuery =
						    "UPDATE students SET course = ? WHERE email = ?";

						PreparedStatement ps = con.prepareStatement(updateQuery);
						ps.setString(1, newCourse);
						ps.setString(2, email);

						int rowsUpdated = ps.executeUpdate();

						if (rowsUpdated > 0) {
						    System.out.println("Course updated successfully");
						    break;
						}
						System.out.println("Failed to perform the update operation, please try again later");
						break;

				}
				case 4:{
					System.out.println("Pease enter the email id you want to delete ");
					String email=br.readLine();
					String verifyEmailExist="SELECT * FROM students WHERE email='"+email+"'";
					ResultSet emailVerify=st.executeQuery(verifyEmailExist);
					if(!emailVerify.next()) {
						System.out.println("The requested email is not found, please verify the email you have entered");
						break;
					}
					String deleteQuery = "DELETE FROM students WHERE email = ?";

					PreparedStatement ps = con.prepareStatement(deleteQuery);
					ps.setString(1, email);

					int rowsDeleted = ps.executeUpdate();

					if (rowsDeleted > 0) {
					    System.out.println("Record deleted successfully");
					    break;
					}
					System.out.println("Failed to delete the row, please try again later");
					break;
				}
				default:{
					System.out.println("Invalid input.");
					break;
				}
				}	
			}	

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to execute queries");
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
