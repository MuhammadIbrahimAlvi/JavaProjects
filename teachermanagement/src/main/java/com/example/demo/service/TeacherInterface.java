package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherInterface {
    public TeacherDTO addTeacher(TeacherDTO teacher);

    String fireTeacher(long dId);

    public List<TeacherDTO> addTeachers(List<TeacherDTO> teachers);

    Optional<Teacher> getTeacherById(long dId);

    public TeacherDTO updateTeacher(TeacherDTO teacher);
}

