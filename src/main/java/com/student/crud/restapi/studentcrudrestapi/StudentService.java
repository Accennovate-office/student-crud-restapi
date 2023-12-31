package com.student.crud.restapi.studentcrudrestapi;

import java.util.List;
 
import jakarta.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class StudentService {
 
    @Autowired
    private StudentRepository repo;
     
    public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student student) {
        repo.save(student);
    }
     
    public Student get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}

