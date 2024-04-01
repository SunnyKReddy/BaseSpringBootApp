package com.learnleadgrow.ut.TestingDemo.service;

import com.learnleadgrow.ut.TestingDemo.model.Student;

import java.util.List;

public interface IStudentService {
    public Student createStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(Long id);
    public Student updateStudent(Long id, Student student);
    public String deleteStudent(Long id);
}
