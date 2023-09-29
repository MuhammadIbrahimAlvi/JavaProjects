package crud;

import crud.dao.StudentRepository;
import crud.entity.Student;
import crud.service.StudentService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestStudentService {

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;
    Student st = new Student(1,"Ibrahim","ebrahimalvi2@gmail.com","Computer Science",true);
    List<Student> list = new ArrayList<Student>();
    Student stdOne = new Student(1, "John", "howtodoinjava@gmail.com", "MCS",true);
//    Student stdTwo = new Student(2, "Alex", "kolenchiski", "alexk@yahoo.com","BSCS",true);
    Student stdThree = new Student(3, "Steve", "swaugh@gmail.com", "MBA",true);

    @Test
    public void createStudent(){
        when(studentRepository.save(st)).thenReturn(st);
        assertEquals(st,studentService.createStudent(st));
        verify(studentRepository,atMostOnce()).save(st);
    }

    @Test
    public void createStudentExist(){
        when(studentRepository.save(st)).thenThrow(new NullPointerException());
        assertThrows(Exception.class, () -> studentService.createStudent(st));
    }

    @Test
    public void deleteStudent(){
        doNothing().when(studentRepository).deleteById(1);
        assertEquals("Student Deleted",studentService.deleteStudent(1));
    }

    @Test
    public void updateStudent(){
     when(studentRepository.findById(1)).thenReturn(Optional.ofNullable(st));
     assertEquals(st,studentService.updateStudent(st));
    }

    @Test
    public void createStudents() {
        list.add(stdOne);
//        list.add(stdTwo);
        list.add(stdThree);
        studentService.createStudents(list);
        when(studentRepository.findById(1)).thenReturn(Optional.ofNullable(stdOne));
        Student std = studentService.getStudentById(1);
        assertEquals("John", std.getName());
        assertEquals("howtodoinjava@gmail.com", std.getEmail());
    }

    @Test
    public void findAllStudents(){
        when(studentRepository.findAll()).thenReturn(list);
        assertEquals(list,studentService.allStudents());
    }

    @Test
    public void findStudent(){
        when(studentRepository.findById(1)).thenReturn(Optional.ofNullable(st));
        assertEquals(st,studentService.getStudentById(1));
    }

//    @Test(expected = NullPointerException.class)
//    public void findStudentNotExist(){
//        when(studentRepository.findById(1)).thenThrow(new NullPointerException());
//        assertEquals(NullPointerException.class,studentService.getStudentById(1));
//    }

    @Test
    public void findStudentNullPointerException(){
        when(studentRepository.findById(1)).thenThrow(new NullPointerException());
        Assertions.assertThrows(NullPointerException.class, ()-> studentService.getStudentById(1));
    }

//    overall
    @Test
    public void studentEnrolled(){
        when(studentRepository.findById(1)).thenReturn(Optional.ofNullable(st));
        assertEquals(true,studentService.enrollChecking(1));
    }
//  else condition
    @Test
    public void elseCheckEnrolled(){
        Optional<Student> st = studentRepository.findById(1);
        if(st.isPresent())
        {
            when(st.get().getCourse().isEmpty()).thenReturn(false);
            assertEquals(false,studentService.enrollChecking(1));
        }
    }
    //  if condition
    @Test
    public void ifCheckEnrolled(){
        Optional<Student> st = studentRepository.findById(1);
        if(st.isPresent())
        {
            when(st.get().getCourse()!=null).thenReturn(true);
            assertEquals(true,studentService.enrollChecking(1));
        }
    }
}
