package com.example.demo.dto;

import com.example.demo.entity.Teacher;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class DepartmentDTO {
    private int dept_id;
    private String dept_name;
    private List<Teacher> teacher_staff;
}