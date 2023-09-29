package controller;

import com.example.hibernatespring.mvc.dao.Student;
import com.example.hibernatespring.mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        return studentService.createStudent(student);
    }

    @GetMapping("/hello")
    public String testTesting() {
        System.out.println("Working Hitted");
        return "Working";
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentService.createStudents(students);
    }

    @GetMapping("/testing")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudent(id);
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
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
