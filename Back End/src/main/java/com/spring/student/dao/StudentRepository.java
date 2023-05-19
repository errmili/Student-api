package com.spring.student.dao;

import com.spring.student.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    /*
    http://localhost:8080/students  Get
    http://localhost:8080/students/1 Get
    http://localhost:8080/students  Post
    http://localhost:8080/students/4 Delete
    http://localhost:8080/students/2 Put
     */
}

