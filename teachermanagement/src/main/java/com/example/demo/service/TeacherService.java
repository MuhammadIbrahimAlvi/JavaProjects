package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.dto.TeacherDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeacherService implements TeacherInterface  {
        @Autowired
        private TeacherRepository teacherRepository;
        @Autowired
        private ModelMapper mapper;
        @Override
        public TeacherDTO addTeacher(TeacherDTO teacher) {
            Teacher std = mapper.map(teacher,Teacher.class);
            return mapper.map(teacherRepository.save(std), TeacherDTO.class);
        }

        @Override
        public String fireTeacher(long dId) {
            teacherRepository.deleteById(dId);
            return "Teacher Deleted";
        }

        @Override
        public List<TeacherDTO> addTeachers(List<TeacherDTO> teachers) {
            List<Teacher> teacher = teachers
                    .stream()
                    .map(teach -> mapper.map(teach, Teacher.class))
                    .collect(Collectors.toList());

            return teacherRepository.saveAll(teacher)
                    .stream()
                    .map(teach -> mapper.map(teach, TeacherDTO.class))
                    .collect(Collectors.toList());
        }

        @Override
        public Optional<Teacher> getTeacherById(long dId) {
            return teacherRepository.findById(dId);
        }

        @Override
        public TeacherDTO updateTeacher(TeacherDTO teacher) {
            Optional<Teacher> optionalTeacher = teacherRepository.findById((long) teacher.getTeacher_id());
            if(optionalTeacher.isPresent()){
                Teacher  teach = null;
                teach = optionalTeacher.get();
//                teach.setTeacher_name(teacher.getTeacher_name());
//                teach.setCourse_list(teacher.getCourse_list());
                Teacher teac = teacherRepository.save(teach);
                return mapper.map(teac, TeacherDTO.class);
            }else {
                return new TeacherDTO();
            }
}
}

