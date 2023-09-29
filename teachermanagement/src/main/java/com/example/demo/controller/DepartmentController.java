package com.example.demo.controller;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import com.example.demo.dto.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class DepartmentController {
    @Autowired(required = true)
    private DepartmentService departmentService;

    @PostMapping("/adddepart")
    public DepartmentDTO addCourse(@RequestBody DepartmentDTO departs) {
        return departmentService.createDept(departs);
    }

    @PostMapping("/adddeparts")
    public List<DepartmentDTO> adddeparts(@RequestBody List<DepartmentDTO> departs) {
        return departmentService.createDepts(departs);
    }

    @GetMapping("/getCourse/{cid}")
    public Optional<Department> getCourseById(@PathVariable long cid) {
        return departmentService.getDeptById(cid);
    }

    @PutMapping("/updateCourse")
    public DepartmentDTO updateCourse(@RequestBody DepartmentDTO course) {
        return departmentService.updateDepart(course);
    }

    @DeleteMapping("/course/{cid}")
    public String deleteStudent(@PathVariable(value = "cid") int cid) throws Exception {
        departmentService.deleteDept(cid);
        return "Course Deleted";
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
