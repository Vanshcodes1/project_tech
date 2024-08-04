package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.entities.Subject;
import com.example.demo.service.StudentService;
import com.example.demo.service.SubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SubjectService subjectService;

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        logger.info("Retrieved students: {}", students);
        return students;
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Set<Subject> subjects = student.getSubjects().stream()
                .map(subject -> subjectService.findByName(subject.getName())
                        .orElseThrow(() -> new RuntimeException("Subject not found: " + subject.getName())))
                .collect(Collectors.toSet());

        student.setSubjects(subjects);
        Student savedStudent = studentService.saveStudent(student);

        logger.info("Created student: {}", savedStudent);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
}
