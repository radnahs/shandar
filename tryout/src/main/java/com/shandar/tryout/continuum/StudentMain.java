package com.shandar.tryout.continuum;

public class StudentMain {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.readFile("enter the file name and path");
	}

}
