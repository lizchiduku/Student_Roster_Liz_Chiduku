package com.codingdojo.mvc.services;

import java.util.List; 
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Student;
import com.codingdojo.mvc.repositories.StudentRepository;





@Service
public class StudentService {
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository bookRepository) {
        this.studentRepository = bookRepository;
    }
	public List<Student> allStudent() {
        return studentRepository.findAll();
    }
	public Student createStudent(Student b) {
        return studentRepository.save(b);
	}
	public Student findStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            return null;
        }
    }
}