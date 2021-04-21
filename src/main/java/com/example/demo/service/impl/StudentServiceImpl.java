package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.IStudentservice;
import com.example.demo.util.StudentUtil;

@Service
public class StudentServiceImpl implements IStudentservice {
	
	@Autowired
	private StudentRepository repo;
	
	//@Autowired
	//private StudentUtil util;
	
	@Override
	public Integer saveStudent(Student s) {
		
		//util.calculateDtls(s);
		StudentUtil.calculateDtls(s);
		s = repo.save(s);
		return s.getStdId();
	}

	@Override
	public void updateStudent(Student s) {
		StudentUtil.calculateDtls(s);
		repo.save(s);
	}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Student getOneStudent(Integer id) {
		Optional<Student> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
