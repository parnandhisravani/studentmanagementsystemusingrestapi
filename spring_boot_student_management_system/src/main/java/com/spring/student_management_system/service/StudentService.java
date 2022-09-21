package com.spring.student_management_system.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.student_management_system.entity.Student;
import com.spring.student_management_system.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;

	public List<Student> getAllStudent() {
		return studentrepository.findAll();
	}
	 
	public Student addStudent(Student student) {
		return studentrepository.save(student);
	}

	public Student updateStudent(Student student, int id) {
		return studentrepository.save(student);
	}

	public void deleteStudent(int id) {
		studentrepository.deleteById(id);
	}

	public Student searchbyId(int id) {
		return studentrepository.findById(id).get();
	}
}


