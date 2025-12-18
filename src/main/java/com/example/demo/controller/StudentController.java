package com.example.demo.serviceimpl;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImple implements StudentService {

    private final StudentRepository studentRepository;

    // Constructor Injection
    public StudentServiceImple(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Stuentity saveStudent(Stuentity student) {
        return studentRepository.save(student);
    }
}