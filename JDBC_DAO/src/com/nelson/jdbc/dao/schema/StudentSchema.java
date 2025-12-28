package com.nelson.jdbc.dao.schema;

public class StudentSchema {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String course;
	
	public StudentSchema() {
		
	}
	public StudentSchema(int id,String fName,String lName,String email,String course) {
		this.id=id;
		this.firstName=fName;
		this.lastName=lName;
		this.email=email;
		this.course=course;
	}
	public int getId() {
	    return id;	
	}
	public void setId(int id) {
	    this.id = id;
	}
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getCourse() {
	    return course;
	}
	public void setCourse(String course) {
	    this.course = course;
	}
	
}
