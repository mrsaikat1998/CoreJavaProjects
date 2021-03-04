package com.nt.list;

public class CollegeManageMentTest {

	public static void main(String[] args) {
		//for Student
		System.out.println("------------------Student---------------");
		Student student1=new Student("Saikat", "WB", 7.88);
		College clg1=new College();
		clg1.addStudent(student1);
		clg1.displayStudent();
		
		//for Faculty
		System.out.println("-------------------Faculty----------------");
		Faculty faculty1=new Faculty("Gaurav", "Bihar", "Java");
		clg1.addFaculty(faculty1);
		clg1.displayFaculty();
	}

}
