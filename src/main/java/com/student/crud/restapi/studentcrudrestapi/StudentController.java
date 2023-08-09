package com.student.crud.restapi.studentcrudrestapi;

import java.util.*;
 
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class StudentController {
 
    @Autowired
    private StudentService service;

    // Health check
    @GetMapping(path = "/")
    public String healthCheck(){
        return "<div align=\"center\" style=\"padding: 20px 10px;background-color: #4477CE;\">\r\n" + //
                "  <h1>SmartByte</h1>\r\n" + //
                "</div>\r\n" + //
                "<div align=\"center\" style=\"margin:25px 50px;padding: 10px 5px;background-color: #35155D;border-radius: 20px;\">\r\n" + //
                "  <h4 style=\"color: white;\">\u2713 Health Okay</h4>\r\n" + //
                "</div>";
    }

    // GET
    // URI - /hello-world
    // Method - "Hello World"
    // @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "<div align=\"center\" style=\"padding: 20px 10px;background-color: #4477CE;\">\r\n" + //
                "  <h1>SmartByte</h1>\r\n" + //
                "</div>\r\n" + //
                "<div align=\"center\" style=\"margin:25px 50px;padding: 10px 5px;background-color: #FAC55B;border-radius: 20px;\">\r\n" + //
                "  <h4>Hello Student</h4>\r\n" + //
                "</div>";
    }
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/students")
    public List<Student> list() {
        return service.listAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student student = service.get(id);
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/students")
    public void add(@RequestBody Student student) {
        service.save(student);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/students/{id}")
    public ResponseEntity<?> update(@RequestBody Student student, @PathVariable Integer id) {
        try {
            Student existstudent = service.get(id);
            service.save(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Delete operation
    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

