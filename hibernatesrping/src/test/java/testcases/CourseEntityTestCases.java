package testcases;

import controller.StudentController;
import com.example.hibernatespring.mvc.dao.Course;
import com.example.hibernatespring.mvc.dao.Student;
import com.example.hibernatespring.mvc.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CourseEntityTestCases {
    @Mock
    StudentService studentService;

    @InjectMocks
    StudentController studentController;

    Student st = new Student();

    Student st2 = new Student();
    Course course1 = new Course();
    Course course2 = new Course();
    Course course3 = new Course();
    List<Course> listCourses = new ArrayList<>();

    List<Student> listStudents = new ArrayList<>();

    @Test
    public void addStudent() {
        course1.setCourse_id(1);
        course1.setCourse_name("Computer Science");
        course2.setCourse_id(2);
        course2.setCourse_name("Mathematics Science");
        listCourses.add(course1);
        listCourses.add(course2);
        st.setStudent_id(1);
        st.setStudent_name("Ibrahim Alvi");
        st.setCourse_list(listCourses);
        when(studentService.createStudent(st)).thenReturn(st);
        assertEquals(st, studentController.addStudent(st));
    }

    @Test(expected = NullPointerException.class)
    public void deleteStudent() throws Exception {
        when(studentService.deleteStudent(1)).thenThrow(new NullPointerException());
        assertEquals(new Exception(),studentController.deleteStudent(1));
    }
}
