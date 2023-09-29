package crud;

import com.fasterxml.jackson.databind.ObjectMapper;
import crud.controller.StudentController;
import crud.dao.StudentRepository;
import crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(StudentController.class)
public class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;

    @MockBean
    StudentRepository studentRepository;

//    Student RECORD_1 = new Student(1, "Muhammad Ibrahim Alvi", "ebrahimalvi2@gmail.com", "Computer Science");
//    Student RECORD_2 = new Student(2, "Muhammad Yousuf Alvi", "yousufalvi2@gmail.com", "Computer Science");
}
