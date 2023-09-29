package com.example.hibernatespring.mvc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    @Column(name = "student_name")
    private String student_name;

    @ManyToMany
    @JoinTable(name = "coursesTable",joinColumns = {@JoinColumn(name="student_id")},inverseJoinColumns = { @JoinColumn(name = "course_id")})
    private List<Course> course_list;
}
