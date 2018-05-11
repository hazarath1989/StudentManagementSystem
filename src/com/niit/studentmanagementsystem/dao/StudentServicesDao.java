package com.niit.studentmanagementsystem.dao;

import java.sql.Connection;
import java.util.List;

import com.niit.studentmanagementsystem.config.DatabaseConnection;
import com.niit.studentmanagementsystem.model.Student;

public interface StudentServicesDao {
   Connection connectionObject=new DatabaseConnection().getConnect();
   public void insertStudentDetails(Student studentObject);
   public List<Student> displayAllStudents();
   public void deletestudentDetails(int no);
}
