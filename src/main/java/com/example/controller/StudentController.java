package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentService.AddStudent(student);	
	}
	
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent(){
		
		return studentService.GetAllStudent();
		
	}
	
	
	@GetMapping("/findById/{id}")
	public Optional<Student> findById(@PathVariable Integer id) {
		return studentService.findStudentById(id);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		
		
		return studentService.UpdateStudent(student);
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		 studentService.deleteStudentById(id);
	}
}
