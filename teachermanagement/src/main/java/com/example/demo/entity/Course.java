package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;

    @Column(name = "course_name")
    private String course_name;

    @JoinTable(name = "teachercoursetable",joinColumns = {@JoinColumn(name="teacher_id")},inverseJoinColumns = { @JoinColumn(name = "course_id")})
    private List<Teacher> enrolledTeachers;

    @JoinTable(name = "coursesTable",joinColumns = {@JoinColumn(name="student_id")},inverseJoinColumns = { @JoinColumn(name = "course_id")})
    private List<Student> enrolledStudents;
}
