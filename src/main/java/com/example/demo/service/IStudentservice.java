package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface IStudentservice {
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Student getOneStudent(Integer id);
	List<Student> getAllStudents();
}
