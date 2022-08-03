package com.test.sms.service;

import com.test.sms.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentByEmailId(String emailId);

    String deleteStudent(Long studentId);

    Student updateStudent(Student student);
}
