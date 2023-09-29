package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Course;
import com.example.demo.dto.CourseDTO;

public interface CourseInterface {
    public CourseDTO createCourse(CourseDTO course);

    public String deleteCourse(int cid);

    public List<CourseDTO> createCourses(List<CourseDTO> courses);

    public Optional<Course> getCourseById(int cid);

    public CourseDTO updateCourse(CourseDTO course);
}
