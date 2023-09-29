package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private int teacher_id;
    @Column(name = "teacher_name")
    private String teacher_name;
    @ManyToMany
    private List<Course> course_list;

    @ManyToMany
    private List<Department> departmentsList;
}
