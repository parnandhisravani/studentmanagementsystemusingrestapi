package com.spring.student_management_system.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.spring.student_management_system.entity.Student;
import com.spring.student_management_system.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@GetMapping("/studentlist")
	public List<Student> getStudent() {
		return this.studentservice.getAllStudent();
	}
	
	@GetMapping("/findstudentbyid/{id}")
	public Student findstudentbyId(@PathVariable("id") int id) {
		return this.studentservice.searchbyId(id);
	}
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student student) {
		return this.studentservice.addStudent(student);
	}

	@PutMapping("/updatestudentbyid/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int id) {
		studentservice.updateStudent(student, id);
		return student;
	}

	@DeleteMapping("/deletestudent/{id}")
	   public void deleteStudent(@PathVariable("id") int id) {
	      this.studentservice.deleteStudent(id);
	   }
}

