package crud;

import crud.controller.StudentController;
import crud.dao.StudentRepository;
import crud.entity.Student;
import crud.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestStudentController {
    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    @Test
    public void addStudent() {
        Student st = new Student(1,"Ibrahim","ebrahimalvi2@gmail.com","Computer Science",true);
        when(studentService.createStudent(st)).thenReturn(st);
        assertEquals(st, studentController.addStudent(st));
    }

    @Test(expected = NullPointerException.class)
    public void deleteStudent() throws Exception {
        when(studentService.deleteStudent(1)).thenThrow(new NullPointerException());
        assertEquals(new Exception(),studentController.deleteStudent(1));
    }
    @Test
    public void insertStudents() {
        List<Student> list = new ArrayList<Student>();
        Student stdOne = new Student(1, "John", "howtodoinjava@gmail.com", "MCS",true);
//        Student stdTwo = new Student(2, "Alex", "kolenchiski", "alexk@yahoo.com","BSCS",true);
        Student stdThree = new Student(3, "Steve", "swaugh@gmail.com", "MBA",true);
        list.add(stdOne);
//        list.add(stdTwo);
        list.add(stdThree);
        studentService.createStudents(list);
        when(studentService.getStudentById(1)).thenReturn(stdOne);
        Student std = studentController.getStudentById(1);
        assertEquals("John", std.getName());
        assertEquals("howtodoinjava@gmail.com", std.getEmail());
    }

}
