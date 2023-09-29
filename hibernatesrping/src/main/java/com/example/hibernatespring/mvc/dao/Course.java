package com.example.hibernatespring.mvc.dao;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;

    @Column(name = "course_name")
    private String course_name;

    @ManyToMany(mappedBy = "course_list")
    private List<Student> enrolledStudents;
}
