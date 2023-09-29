package com.example.demo.dto;

//import com.example.demo.entity.Course;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
public class StudentDTO {
    private int student_id;
    private String student_name;

//    private List<Course> course_list;
}
