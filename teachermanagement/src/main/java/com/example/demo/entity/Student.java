package com.example.demo.entity;

//import com.example.demo.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    @Column(name = "student_name")
    private String student_name;

    @ManyToMany
    private List<Course> course_list;
}
