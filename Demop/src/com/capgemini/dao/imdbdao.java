package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capgemini.connectionSupport.DataBaseConnection;

public class imdbdao
{
	public int insert(String email,String password,String mobile,String username )throws SQLException
	{
		String query="insert into registration values(?,?)";
		Connection conn =DataBaseConnection.getConnection();
		//System.out.println(conn);
		PreparedStatement preparedStatement= conn.prepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2,password);
		preparedStatement.setString(3,mobile);
		preparedStatement.setString(4,username);
		int res=preparedStatement.executeUpdate();
		return res;	
	}
}
