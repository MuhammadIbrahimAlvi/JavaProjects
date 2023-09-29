package com.example.hibernatespring.mvc.service;

import com.example.hibernatespring.mvc.repository.CourseRepository;
import com.example.hibernatespring.mvc.dao.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

interface CourseServices{
    public Course createCourse(Course course);

    public String deleteCourse(int cid);

    public List<Course> createCourses(List<Course> courses);

    public Course getCourseById(int cid);

    public Course updateCourse(Course course);
}

@Service
public
class CourseService implements CourseServices {
    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course)
    {
        return courseRepository.save(course);
    }

    public String deleteCourse(int cid){
        try {
            courseRepository.deleteById(cid);
            System.out.println(cid);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "Course Deleted";
    }

    public List<Course> createCourses(List<Course> courses)
    {
        return courseRepository.saveAll(courses);
    }

    public Course getCourse(int id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()){
            return course.get();
        }
        return null;
    }

    public Course getCourseById(int cid)
    {
        return courseRepository.findById(cid).orElse(null);
    }

    public Course updateCourse(Course course)
    {
        Course oldCourse = null;
        Optional<Course> optionalStudent = courseRepository.findById(course.getCourse_id());
        if(optionalStudent.isPresent()){
            oldCourse = optionalStudent.get();
            oldCourse.setCourse_name(course.getCourse_name());
            oldCourse.setEnrolledStudents(course.getEnrolledStudents());
            courseRepository.save(oldCourse);
        }else {
            return new Course();
        }
        return oldCourse;
    }
}
