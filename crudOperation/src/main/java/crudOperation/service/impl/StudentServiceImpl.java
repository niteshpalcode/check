package crudOperation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crudOperation.entity.Student;
import crudOperation.repo.StudentDao;
import crudOperation.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		Student student2=studentDao.save(student);
		System.out.println(student.toString());
	}

	public List<Student> viewAll() {
	
		List<Student> listOfStudents=studentDao.findAll();
		return listOfStudents;
		
		
	}

}
