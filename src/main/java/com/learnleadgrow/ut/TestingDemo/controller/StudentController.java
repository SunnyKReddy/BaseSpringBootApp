package com.learnleadgrow.ut.TestingDemo.controller;

import com.learnleadgrow.ut.TestingDemo.model.Student;
import com.learnleadgrow.ut.TestingDemo.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.createStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        String deleteMessage = studentService.deleteStudent(id);
        return new ResponseEntity<>(deleteMessage, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
        Student savedStudent = studentService.getStudent(id);
        return new ResponseEntity<>(savedStudent, HttpStatus.OK);
    }


}
