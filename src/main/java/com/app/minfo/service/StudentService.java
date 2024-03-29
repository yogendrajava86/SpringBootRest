package com.app.minfo.service;

import java.util.List;

import com.app.minfo.model.Student;

public interface StudentService {

	public Integer saveStudent(Student student);
	public void deleteStudent(Integer id);
	
	public Student getStudentById(Integer id);
	public List<Student> getAllStudents();
	public boolean studentExist(Integer id);
}
