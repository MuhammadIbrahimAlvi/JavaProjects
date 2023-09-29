package com.example.hibernatespring.mvc.service;

import com.example.hibernatespring.mvc.dao.Student;
import com.example.hibernatespring.mvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface StudentServices{
    public Student createStudent(Student student);

    public String deleteStudent(int id);

    public List<Student> createStudents(List<Student> students);

    public Student getStudentById(int id);

//    public Student updateStudent(Student student);
}

@Service
public class StudentService implements StudentServices {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public String deleteStudent(int id){
        try {
            studentRepository.deleteById(id);
            System.out.println(id);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "Student Deleted";
    }

    public List<Student> createStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student getStudent(int id) {
        Optional<Student> student = studentRepository.findById(1);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    public Student getStudentById(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Student student)
    {
        Student oldStudent = null;
        Optional<Student> optionalStudent = studentRepository.findById(student.getStudent_id());
        if(optionalStudent.isPresent()){
            oldStudent = optionalStudent.get();
            oldStudent.setStudent_name(student.getStudent_name());
            oldStudent.setCourse_list(student.getCourse_list());
            studentRepository.save(oldStudent);
        }else {
            return new Student();
        }
        return oldStudent;
    }
}
