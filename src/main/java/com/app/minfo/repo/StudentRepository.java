package com.app.minfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.minfo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
