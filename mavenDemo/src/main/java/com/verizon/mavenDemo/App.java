package com.verizon.mavenDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) //throws SQLException
    {
//    	try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("error"+e.getMessage());
//		}
//		Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/verizon_training", "root", "");	
//		System.out.println("connected");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
//    	IndianCricketer indianCricketer = context.getBean("IC", IndianCricketer.class);
//    	indianCricketer.play();
    	
    	IndianCricketer indian = context.getBean("indianCricketer", IndianCricketer.class);
    	indian.play();
    	
		
		
    }
}
