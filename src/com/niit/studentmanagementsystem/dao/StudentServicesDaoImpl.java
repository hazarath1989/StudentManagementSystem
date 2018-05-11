package com.niit.studentmanagementsystem.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.niit.studentmanagementsystem.model.Student;

public class StudentServicesDaoImpl implements StudentServicesDao{
    String query="";
    PreparedStatement prepareStatement=null;
    ResultSet resultSet=null;
	@Override
	public void insertStudentDetails(Student studentObject) {
		// TODO Auto-generated method stub
		try{
			 query="insert into student values(?,?,?,?)";
	         prepareStatement=connectionObject.prepareStatement(query);
	         prepareStatement.setInt(1,studentObject.getStudentId());
	         prepareStatement.setString(2, studentObject.getStudentName());
	         prepareStatement.setString(3, studentObject.getStudentAddress());
	         prepareStatement.setString(4, studentObject.getGender());
	         prepareStatement.execute();
	         System.out.println("Successfully inserted");
		}catch(SQLException exception){
			exception.printStackTrace();
		}
	}

	@Override
	public List<Student> displayAllStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList=new LinkedList<Student>();
		try{
		query="select *from student";
		prepareStatement=connectionObject.prepareStatement(query);
		resultSet=prepareStatement.executeQuery();
		while(resultSet.next()){
			Student newStudent=new Student();
			newStudent.setStudentId(Integer.parseInt(resultSet.getString(1)));
			newStudent.setStudentName(resultSet.getString(2));
			newStudent.setStudentAddress(resultSet.getString(3));
			newStudent.setGender(resultSet.getString(4));
			studentList.add(newStudent);
		}
		return studentList;
		}catch(SQLException exception){
			exception.printStackTrace();
			return null;
		}
	}
		public void deletestudentDetails(int idno)
		{
			try{
								
				String query="delete student where student_id=?";
				prepareStatement=connectionObject.prepareStatement(query);
				prepareStatement.setInt(1, idno);;
				prepareStatement.executeUpdate();
				System.out.println("delete one record");
			}catch(SQLException exception){
				exception.printStackTrace();
			
			}
		}
		
	}


