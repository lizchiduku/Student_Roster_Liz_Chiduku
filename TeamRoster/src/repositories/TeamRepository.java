package com.codingdojo.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.Student;


@Repository
public interface TeamRepository extends CrudRepository<Student, Long>{
	List<Student> findAll();
}