package com.example.demo.controller;

import com.example.demo.service.TeacherService;
import com.example.demo.dto.TeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addteacher")
    public TeacherDTO addteacher(@RequestBody TeacherDTO teacher) {
        System.out.println(teacher);
        return  teacherService.addTeacher(teacher);
    }

    @PostMapping("/addteachers")
    public List<TeacherDTO> addteachers(@RequestBody List<TeacherDTO> teachers) {
        return  teacherService.addTeachers(teachers);
    }

    @PutMapping("/updateteacher")
    public TeacherDTO updateteacher(@RequestBody TeacherDTO teacher) {
        return  teacherService.updateTeacher(teacher);
    }

    @DeleteMapping("/teacher/{id}")
    public String deleteteacher(@PathVariable(value = "id") int id) throws Exception {  teacherService.fireTeacher(id);
        return "Teacher Deleted";
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}