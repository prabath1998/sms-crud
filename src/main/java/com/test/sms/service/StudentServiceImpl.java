package com.test.sms.service;

import com.test.sms.entity.Student;
import com.test.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService{
    @Autowired
    public StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByEmailId(String emailId) {
        return studentRepository.findByEmailId(emailId);
    }

    @Override
    public String deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
        return "Student deleted with ID : " + studentId;
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
}
