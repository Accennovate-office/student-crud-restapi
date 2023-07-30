package com.student.crud.restapi.studentcrudrestapi;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class Student {
    private Integer id;
    private String name;
    private Integer rollno;
    private String gender;
    private Date dob;
 
    public Student() {
    }
 
    public Student(Integer id, String name, Integer rollno, String gender, Date dob) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;      
        this.gender = gender;  
        this.dob = dob;

    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
 
    // other getters and setters...
    
}

