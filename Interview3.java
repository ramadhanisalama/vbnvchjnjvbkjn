package com.assignment.general;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Interview3  extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String name3 = req.getParameter("n3");
		String marks3 = req.getParameter("m3");
		
		try {
			Connection co = DatabaseConnection.getConnection();
			
			
			String query3 = "SELECT intertview_id FROM interview WHERE name = '"+name3+"'";
			Statement st3 = co.createStatement();
			ResultSet r = st3.executeQuery(query3);
			if(r.next())
			{
				String id = r.getString("intertview_id");
				String query  = "UPDATE interview SET t_round = '"+marks3+"' WHERE name = '"+name3+"' and intertview_id = '"+id+"'";
				Statement st = co.createStatement();
				int y = st.executeUpdate(query);
				if(y == 1)
				{
					res.sendRedirect("index.jsp");
				}
			}
			
			
			
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
