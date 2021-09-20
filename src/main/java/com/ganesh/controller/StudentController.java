package com.ganesh.controller;


import com.ganesh.models.Gender;
import com.ganesh.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @created: 20/09/2021 - 3:05 PM
 * @author: Ganesh
 */

@RestController
@RequestMapping("api/v1/students")
public class StudentController {


    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(1L,"Ganesh","ganesh@gmail.com", Gender.MALE ),
                new Student(2L, "TestUser", "testuser@gmail.com", Gender.FEMALE));
         return students;
    }

}
