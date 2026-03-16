package com.eg.service;

import java.util.List;

import com.eg.model.Student;

public interface StudentService {

	Student postStu(Student s);

	List<Student> getAll();

	Student getSTU(int id);

	void deleteStu(int id);

	Student updateStu(Student s, int id);
	

}
