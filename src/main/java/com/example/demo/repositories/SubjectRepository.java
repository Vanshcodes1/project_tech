package com.example.demo.repositories;


import com.example.demo.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

       // Set<Subject>findByStudentId(Integer studentId);
}
