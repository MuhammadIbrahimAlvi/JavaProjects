package com.example.demo.repository;


import com.example.demo.entity.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface CourseRepository extends JpaRepository<Course, Integer> {
}
