package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dept_id;
    @Column(name = "dept_name")
    private String dept_name;

    @JoinTable(name = "DepartTeacherTable",joinColumns = {@JoinColumn(name="dept_id")},inverseJoinColumns = { @JoinColumn(name = "teacher_id")})
    private List<Teacher> teacher_staff;
}
