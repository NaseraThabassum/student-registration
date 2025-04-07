package com.example.studentregistration.controller;

import com.example.studentregistration.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {
    private List<Student> students = new ArrayList<>();

    @PostMapping("/students")
    public ResponseEntity<Student> registerStudent(@RequestBody Student student) {
        student.setRegistrationDate(new java.util.Date());
        students.add(student);
        return ResponseEntity.ok(student);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(students);
    }
}