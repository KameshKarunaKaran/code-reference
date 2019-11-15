package Operate;

import java.sql.Connection;

import java.sql.PreparedStatement;

import project.DB_Connection;

public class Insert_Values {

	
	public void insert_values(String Name)
	{
		DB_Connection obj_DB_Connection = new DB_Connection();
		Connection connection = obj_DB_Connection.get_connection();
		
		PreparedStatement ps = null;
		
		try
		{
			
		
			String query="INSERT INTO practice.data(Name) values (?)";
		
		ps=connection.prepareStatement(query);
		
		ps.setString(1, Name);
		
		ps.executeUpdate();
		
		}
		catch(Exception e) {
			System.err.println(e);
			
		}
	}

	

}
