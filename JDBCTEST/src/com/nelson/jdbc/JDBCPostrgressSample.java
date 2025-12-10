package com.nelson.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCPostrgressSample {
	private final String url="jdbc:postgresql://localhost/nelson";
	private final String user="postgres";
	private final String password="password";
	private void connect() {
		try(Connection con= DriverManager.getConnection(url,user,password)){
			if(con!=null) {
				System.out.println("Db connected success fully");
			}else {
				System.err.println("Something went wrong, Db not connected");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JDBCPostrgressSample dbConnection=new JDBCPostrgressSample();
		dbConnection.connect();
	}

}
