package com.student.crud.restapi.studentcrudrestapi;

import org.springframework.data.jpa.repository.JpaRepository;
 
public interface StudentRepository extends JpaRepository<Student, Integer> {
 
}

