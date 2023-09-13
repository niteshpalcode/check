package crudOperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import crudOperation.entity.Student;
@Service
public interface StudentService {

	
	public void addStudent(Student student);
	public List<Student> viewAll();
}
