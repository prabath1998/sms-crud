package com.test.sms.controller;

import com.test.sms.entity.Student;
import com.test.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
