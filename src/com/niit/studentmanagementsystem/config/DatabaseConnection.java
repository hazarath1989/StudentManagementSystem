package com.niit.studentmanagementsystem.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	 static Connection connectionObject=null;
     public Connection getConnect(){
    	 try{
    		  String driverName="org.h2.Driver";
    		  String userName="sa";
    		  String password="";
    		  String url="jdbc:h2:tcp://localhost/~/test";
    		  Class.forName(driverName);
    		  connectionObject=DriverManager.getConnection(url,userName,password);
    	      return connectionObject;
    	 }catch(SQLException | ClassNotFoundException exception){
    		 exception.printStackTrace();
    		 return null;
    	 }
     }
     /*public static void main(String[] args) {
    	
		if(new DatabaseConnection().getConnect()!=null)
			System.out.println("Connection success");
	}*/
     
}
