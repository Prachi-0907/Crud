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
	public List<Student> getAll() {
		
		return sr.findAll();
	}

	@Override
	public void deleteStu(int id) {
		
		sr.deleteById(id);
	}

	@Override
	public Student updateStu(Student s, int id) {
		Student stu = sr.findById(id).orElse(null);
		
		stu.setName(s.getName());
		stu.setEmail(s.getEmail());
		
		return sr.save(stu);
	}

	@Override
	public Student getSTU(int id) {
Optional<Student> op = sr.findById(id);
		
		if(op.isPresent()) {
			Student s = op.get();
			return s;
		}
		return null;
	}

	
	


}
