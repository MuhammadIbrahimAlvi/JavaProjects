package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.dto.StudentDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService implements StudentInterface {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper mapper;

    public StudentDTO createStudent(StudentDTO student)
    {
        Student std = mapper.map(student,Student.class);
        return mapper.map(studentRepository.save(std), StudentDTO.class);
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

    public List<StudentDTO> createStudents(List<StudentDTO> students) {
        List<Student> std = students
                .stream()
                .map(stud -> mapper.map(stud, Student.class))
                .collect(Collectors.toList());

        return studentRepository.saveAll(std)
                .stream()
                .map(stud -> mapper.map(stud, StudentDTO.class))
                .collect(Collectors.toList());
    }

    public Optional<Student> getStudentById(int id)
    {
        return studentRepository.findById(id);
    }

    public StudentDTO updateStudent(StudentDTO student)
    {
        Optional<Student> optionalStud = studentRepository.findById(student.getStudent_id());
        if(optionalStud.isPresent()){
            Student  stud = null;
            stud = optionalStud.get();
//            stud.setStudent_name(stud.getStudent_name());
//            stud.setCourse_list(stud.getCourse_list());
            Student stud1 = studentRepository.save(stud);
            return mapper.map(stud1, StudentDTO.class);
        }else {
            return new StudentDTO();
        }
    }
}
