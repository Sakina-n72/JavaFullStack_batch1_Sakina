package javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/verizon_training", "root", "");	
			PreparedStatement statement = dbConnect.prepareStatement("insert into first(firstname, lastname) values(?, ?)");
			statement.setString(1,"tiwari");
			statement.setString(2, "vineet");
//			ResultSet resultset = statement.executeQuery("select * from first");
//			while(resultset.next()) {
//				System.out.println(resultset.getString("age"));
//			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Issue while loading driver :"+e.getMessage());
		}
		
		

	}

}
