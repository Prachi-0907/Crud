package com.eg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eg.model.Student;
import com.eg.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/post")
	public Student postStu(@RequestBody Student s) {
		
		return ss.postStu(s);
		
	}
	
	@GetMapping("/getAll")
	public List<Student> getStu(@RequestBody Student s){
		
		return ss.getStu(s);
		
	}
	
	@GetMapping("/get")
	public Student getSTU(@PathVariable int id) {
		return ss.getStu(id);
	}
	
	@DeleteMapping("/delete")
	public void deletStu(@PathVariable int id) {
		ss.deleteStu(id);
	}
	
	@PutMapping("/put")
	public Student updateStu(@RequestBody Student s, @PathVariable int id) {
		return ss.updateStu(s,id);
	}

}
