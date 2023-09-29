package crud.service;

import crud.dao.StudentRepository;
import crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface Services{
    public Student createStudent(Student student);

    public String deleteStudent(int rollNo);

    public List<Student> createStudents(List<Student> students);

    public Student getStudentById(int rollNo);

    public Student updateStudent(Student student);

    public boolean enrollChecking(int id);
}
@Service
public class StudentService implements Services {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(int rollNo) {
        try {
            studentRepository.deleteById(rollNo);
            System.out.println(rollNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Student Deleted";
    }

    public List<Student> createStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public Student getStudentById(int rollNo) {
        return studentRepository.findById(rollNo).orElse(null);
    }

    public Student updateStudent(Student student) {
        Student oldStudent = null;
        Optional<Student> optionalStudent = studentRepository.findById(student.getRollNo());
        if (optionalStudent.isPresent()) {
            oldStudent = optionalStudent.get();
            oldStudent.setName(student.getName());
            oldStudent.setCourse(student.getCourse());
            oldStudent.setEmail(student.getEmail());
            studentRepository.save(oldStudent);
        } else {
            return new Student();
        }
        return oldStudent;
    }

    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    public boolean enrollChecking(int id) {
        Optional<Student> stud = studentRepository.findById(id);
        if (stud.isPresent()) {
            Student stud1 = stud.get();
            if (stud1.getCourse().isEmpty()!=true) {
                stud1.setEnrolled(true);
                studentRepository.save(stud1);
                return true;
            } else {
                stud1.setEnrolled(false);
                studentRepository.save(stud1);
                return false;
            }
        }
        return false;
    }
}
