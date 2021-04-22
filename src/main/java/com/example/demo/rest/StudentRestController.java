package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.IStudentservice;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentRestController {
	
	@Autowired
	private IStudentservice service;
	
	@PostMapping("/create")
	public ResponseEntity<String> saveStudent(
			@RequestBody Student student)
	{
		Integer id = service.saveStudent(student);
		String body = "Student saved with id: "+id;
		return ResponseEntity.ok(body);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		List<Student> list = service.getAllStudents();
		return ResponseEntity.ok(list);
	}
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> getOneStudent(
			@PathVariable Integer id)
	{
		Student s = service.getOneStudent(id);
		return ResponseEntity.ok(s);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStudent(
			@PathVariable Integer id)
	{
		service.deleteStudent(id);
		String body = "Student deleted successfully id : "+id;
		return ResponseEntity.ok(body);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> UpdateStudent(
			@RequestBody Student student)
	{
		service.updateStudent(student);
		String body = "Student updated: "+student.getStdId();
		return ResponseEntity.ok(body);
	}
}
