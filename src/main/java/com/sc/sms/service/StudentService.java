package com.sc.sms.service;

import com.sc.sms.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById (Long id);

    void updateStudent(Student student);
    void deleteStudentById(Long id);
}
