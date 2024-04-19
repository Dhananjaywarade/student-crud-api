package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@Service
public class StudentService{
	
	@Autowired
	StudentRepo studentRepo;

	public Student AddStudent(Student student) {
		
		return studentRepo.save(student);
	}

	public List<Student> GetAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	public Student UpdateStudent(Student student) {
		
		return studentRepo.save(student);
		
	}

	public Optional<Student> findStudentById(Integer id) {
		
		return studentRepo.findById(id);
	}

	public void deleteStudentById(Integer id) {
		
		 studentRepo.deleteById(id);
				
	}
	
	
}
