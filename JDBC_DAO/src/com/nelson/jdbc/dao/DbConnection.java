package com.nelson.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
//	TODO : use env to load these as envs	
	private final String url="jdbc:postgresql://localhost/student_db";
	private final String user="postgres";
	private final String password="password";
	private Connection con=null;
	
    public Connection connect() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Db connected successfully...");
            this.con=con;
            return con;
        } catch (SQLException e) {
        	System.err.println("Db connection failed...");
            e.printStackTrace();
        }
        return null;
    }
    public Connection getConnectionObj() throws Exception {
	if(this.con!=null) {
	    return this.con;
	}
	throw new Exception("Connection not established please run connect before calling this");
    }
}
