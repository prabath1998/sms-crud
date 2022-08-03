package com.test.sms.service;

import com.test.sms.entity.Student;
import com.test.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements StudentService{
    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
