package com.example.demo.controller;

import com.example.demo.entities.Subject;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject savedSubject = subjectService.saveSubject(subject);
        return new ResponseEntity<>(savedSubject, HttpStatus.CREATED);
    }
}