package crud.controller;

import java.util.List;
import java.util.Optional;

import crud.dao.StudentRepository;
import crud.entity.Student;
import crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student students) {
        return studentService.createStudent(students);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.createStudents(students);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.allStudents();
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student) {
          return studentService.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id) throws Exception {
         studentService.deleteStudent(id);
         return "Student Deleted";
    }

    @GetMapping("/checkStudent/{id}")
    public boolean checkEnrolled(@PathVariable int id){
        Student stud = studentService.getStudentById(id);
            return studentService.enrollChecking(id);
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}