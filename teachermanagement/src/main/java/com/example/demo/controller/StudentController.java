package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public StudentDTO addStudent(@RequestBody StudentDTO student) {
        System.out.println(student);
        return studentService.createStudent(student);
    }

    @GetMapping("/hello")
    public String testTesting() {
        System.out.println("Working Hitted");
        return "Working";
    }

    @PostMapping("/addStudents")
    public List<StudentDTO> addStudents(@RequestBody List<StudentDTO> students) {
        return studentService.createStudents(students);
    }

    @GetMapping("/testing")
    public Optional<Student> getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/updateStudent")
    public StudentDTO updateStudent(@RequestBody StudentDTO student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id) throws Exception {
        studentService.deleteStudent(id);
        return "Student Deleted";
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
