package crudOperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import crudOperation.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>   {

}
