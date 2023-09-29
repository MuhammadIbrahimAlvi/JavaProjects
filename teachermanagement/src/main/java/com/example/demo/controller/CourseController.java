package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import com.example.demo.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired(required = true)
    private CourseService courseService;

    @PostMapping("/addCourse")
    public CourseDTO addCourse(@RequestBody CourseDTO courses) {
        return courseService.createCourse(courses);
    }

    @PostMapping("/addCourses")
    public List<CourseDTO> addCourses(@RequestBody List<CourseDTO> courses) {
        return courseService.createCourses(courses);
    }

    @GetMapping("/getCourse/{cid}")
    public Course getCourseById(@PathVariable int cid) {
        return courseService.getCourse(cid);
    }

    @PutMapping("/updateCourse")
    public CourseDTO updateCourse(@RequestBody CourseDTO course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{cid}")
    public String deleteStudent(@PathVariable(value = "cid") int cid) throws Exception {
        courseService.deleteCourse(cid);
        return "Course Deleted";
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
