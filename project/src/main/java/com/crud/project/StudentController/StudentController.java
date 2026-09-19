package com.crud.project.StudentController;

import com.crud.project.model.Student;
import com.crud.project.studentRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;
    @GetMapping("/student")
    public List<Student> getAllStudents(){
        List<Student> list=repo.findAll();
        return list;
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student=repo.findById(id).get();
        return student;
    }
}
