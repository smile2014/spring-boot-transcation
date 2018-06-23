package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	/**
	 * findByName
	 * @param name
	 * @return
	 */
	List<Teacher>findByName(String name);
}
