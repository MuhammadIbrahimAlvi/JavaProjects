package controller;

import com.example.hibernatespring.mvc.service.CourseService;
import com.example.hibernatespring.mvc.dao.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course courses) {
        return courseService.createCourse(courses);
    }

    @PostMapping("/addCourses")
    public List<Course> addCourses(@RequestBody List<Course> courses) {
        return courseService.createCourses(courses);
    }

    @GetMapping("/getCourse/{cid}")
    public Course getCourseById(@PathVariable int cid) {
        return courseService.getCourse(cid);
    }

    @PutMapping("/updateCourse")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/course/{cid}")
    public String deleteStudent(@PathVariable(value = "cid") int cid) throws Exception {
        courseService.deleteCourse(cid);
        return "Course Deleted";
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
