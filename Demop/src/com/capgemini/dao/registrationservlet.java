package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

import com.capgemini.connectionSupport.DataBaseConnection;

public class registrationservlet {

	public  int register(String email,String password,String mobile,String username)  throws SQLException 
	{
		    Connection con =DataBaseConnection.getConnection();
		    System.out.println(con);
		    String sql =   "insert into registration values (?,?,?,?)";
			  PreparedStatement pst =   con.prepareStatement(sql);
			  pst.setString(1, email);
			  pst.setString(2, password);
			  pst.setString(3, mobile);
			  pst.setString(4, username);
			  int output = pst.executeUpdate();
			 
			
		return output;
	}
}

