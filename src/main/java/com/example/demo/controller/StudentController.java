package com.example.demo.contrroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/postdata")
    public Stuentity postdata(@RequestBody Stuentity student){
        return studentService.saveStudent(student);
    }
}