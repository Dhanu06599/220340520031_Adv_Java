package com.cdac.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver"); 
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinnar", "Dhananjay", "dhanu123");  
			 Statement s = con.createStatement();
			int rows = s.executeUpdate("insert into emp1 values(1,'Kalpesh',10000)");
//			 int rows = s.executeUpdate("update emp1 set salary=20000 where empid=1");
		 if(rows>0) {
				 System.out.println("Inserted successfully");
		 }else {
			 System.out.println("Some error occured");
		 }
			 ResultSet rs = s.executeQuery("select * from emp1");
			 while(rs.next()) {
				 int empid = rs.getInt("empid");
				 String empname = rs.getString("empname");
				 int salary = rs.getInt("salary");
				 System.out.println(empid+" "+empname+" "+salary);
			 }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
