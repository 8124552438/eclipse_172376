package com.capgemini.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class imdbdao
{
	
		static boolean status=false; 
		public boolean validate(String email,String password)
		{ 
			
			//System.out.println(username+"---"+Password);
		    String emailDB=null;
		    String passDB=null;
			try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");  
			      System.out.println(con);
			//PreparedStatement ps=con.prepareStatement("select * from registration where email=? and password=?");
			      PreparedStatement ps=con.prepareStatement("select email,password from registration ");
//			ps.setString(1,email);  
//			ps.setString(2,password);  
		      
			ResultSet rs=ps.executeQuery(); 
			System.out.println(rs);
			while(rs.next()) {
				emailDB=rs.getString("email");
				passDB=rs.getString("password");
				System.out.println(emailDB+" DB "+passDB);
				if(emailDB.equalsIgnoreCase(email) && passDB.equalsIgnoreCase(password)) {
					return true;
				}
			}
				
		
			          
			}catch(Exception e){System.out.println(e);}
		
				return false;
			
			}  
		
}
