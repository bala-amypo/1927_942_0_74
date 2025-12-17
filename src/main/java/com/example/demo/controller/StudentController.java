package com.example.demo.controller;

import 
import org.springframework.web.bind.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Stuentity;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired
    StudentService studentService;

    @PostMapping("/postdata")
    public Student postdata(@RequestBody Stuentity student){
        return studentService.saveStudent(student);
    }
}