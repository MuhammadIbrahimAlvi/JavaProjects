package com.example.demo.dto;

import com.example.demo.entity.Student;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
public class CourseDTO {
    private int course_id;

    private String course_name;

    private List<Student> enrolledStudents;
}