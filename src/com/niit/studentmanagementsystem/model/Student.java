package com.niit.studentmanagementsystem.model;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String gender;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setStudentId(int studentId){
		this.studentId=studentId;
	}
	public int getStudentId(){
		return studentId;
	}

}
