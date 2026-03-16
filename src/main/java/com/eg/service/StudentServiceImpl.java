package com.eg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eg.model.Student;
import com.eg.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepo sr;

	@Override
	public Student postStu(Student s) {
		Student stu = sr.save(s);
		return stu;
	}

	@Override
	public List<Student> getStu(Student s) {
		
		return sr.findAll();
	}

	@Override
	public Student getStu(int id) {
		
		Optional<Student> op = sr.findById(id);
		
		if(op.isPresent()) {
			Student s = op.get();
			return s;
		}
		
		return null;
	}

	@Override
	public void deleteStu(int id) {
		
		sr.deleteById(id);
	}

	
	


}
