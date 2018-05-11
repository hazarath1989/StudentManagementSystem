package com.niit.studentmanagementsystem.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import com.niit.studentmanagementsystem.dao.StudentServicesDao;
import com.niit.studentmanagementsystem.dao.StudentServicesDaoImpl;
import com.niit.studentmanagementsystem.model.Student;

public class Sample {
	 
	 StudentServicesDao studentDao=new StudentServicesDaoImpl();
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 public void insertStudentDetails(){
		 try{
		 Student studentObject=new Student();
		 System.out.println("Enter student ID");
		 int studentId=Integer.parseInt(br.readLine());
		 System.out.println("Enter Student Name");
		 String name=br.readLine();
		 System.out.println("Enter Student address");
		 String address=br.readLine();
		 System.out.println("Enter Gender");
		 String gender=br.readLine();
		 studentObject.setStudentId(studentId);
		 studentObject.setGender(gender);
		 studentObject.setStudentAddress(address);
		 studentObject.setStudentName(name);
		 studentDao.insertStudentDetails(studentObject);
		 }catch(IOException exception){
			 exception.printStackTrace();
		 }
		 
	 }
	 public void displayAllStudents(){
		 List<Student> studentsList=studentDao.displayAllStudents();
		 Iterator myList=studentsList.iterator();
		 System.out.println("**********************************************************************************************");
		 System.out.println(" ^^^^^^^^^^^^^^^       STUDENT TABLE    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		 System.out.println(" STUDENTID|STUDENTNAME|STUDENT ADRESS|GENDER");
		 
		 while(myList.hasNext()){
			 Student obj=(Student)myList.next();
			 
			 System.out.println(obj.getStudentId()+"  "+obj.getStudentName()+"  "+obj.getStudentAddress()+"  "+obj.getGender());
			 		 
		 }
		 System.out.println("------------------------  END  ---------------------------------------------------------");
	 }
	 public void deletestudents()
	 { try{
		 System.out.println(" enter student id number to delete reacord");
		 int idno=Integer.parseInt(br.readLine());
		 studentDao.deletestudentDetails(idno);
	 }catch(IOException exception){
		 exception.printStackTrace();
	 }
	 }
	 public void menu(){
		 try{
		 int choice;
		 System.out.println("Press 1 for insert new Student");
		 System.out.println("Press 2 for display all Students details");
		 System.out.print("press 3 for delete recor");
		 System.out.println("Press 4 for exit");
		 System.out.println("Choose your option");
		 choice=Integer.parseInt(br.readLine());
		 switch(choice){
		 case 1: insertStudentDetails();menu();break;
		 case 2: displayAllStudents();menu();break;
		 case 3: deletestudents();menu();break;
		 case 4: System.exit(0);
		 default: System.out.println("Sorry Wrong Choice");menu();
		 }
		 }catch(IOException exception){
			 exception.printStackTrace();
		 }
		 }
		 
	 
     public static void main(String[] args) {
	      new Sample().menu();
	}
}
