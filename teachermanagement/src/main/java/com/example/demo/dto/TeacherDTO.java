package com.example.demo.dto;

//import com.example.demo.entity.Course;
import com.example.demo.entity.Department;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
public class TeacherDTO  {
    private int teacher_id;
    private String teacher_name;
//    private List<Course> course_list;
    private List<Department> dept_affliated;
}
