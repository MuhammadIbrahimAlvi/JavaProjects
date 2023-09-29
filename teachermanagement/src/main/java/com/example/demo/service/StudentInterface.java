package com.example.demo.service;
import com.example.demo.entity.Student;
import com.example.demo.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentInterface {
    public StudentDTO createStudent(StudentDTO student);

    public String deleteStudent(int id);

    public List<StudentDTO> createStudents(List<StudentDTO> students);

    public Optional<Student> getStudentById(int id);

    public StudentDTO updateStudent(StudentDTO student);
}
