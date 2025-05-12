package com.microservices.StudentService.Controller;

import com.microservices.StudentService.DTO.StudentResponse;
import com.microservices.StudentService.Entity.student;
import com.microservices.StudentService.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getById/{id}")
    public StudentResponse studentById(@PathVariable("id") long id){
        return studentService.findById(id);
    }
}
