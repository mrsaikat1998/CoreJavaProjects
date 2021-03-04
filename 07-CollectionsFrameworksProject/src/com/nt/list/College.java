package com.nt.list;

import java.util.ArrayList;
import java.util.List;

public class College {
	private List<Student> studentList;
	private List<Faculty> facultyList;

	public College() {
		studentList = new ArrayList();
		facultyList = new ArrayList();
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addFaculty(Faculty faculty) {
		facultyList.add(faculty);
	}

	public void displayStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList);
		}
	}

	public void displayFaculty() {
		for (int i = 0; i < facultyList.size(); i++) {
			System.out.println(facultyList);
		}
	}
}
