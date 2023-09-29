package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.dto.CourseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService implements CourseInterface {
    @Autowired(required = true)
    private CourseRepository courseRepository;
    @Autowired
    private ModelMapper mapper;
    public CourseDTO createCourse(CourseDTO course)
    {
        Course d = mapper.map(course,Course.class);
        return mapper.map(courseRepository.save(d), CourseDTO.class);
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

    public List<CourseDTO> createCourses(List<CourseDTO> courses)
    {
        List<Course> course = courses
                .stream()
                .map(course1 -> mapper.map(course1, Course.class))
                .collect(Collectors.toList());

        return courseRepository.saveAll(course)
                .stream()
                .map(course1 -> mapper.map(course1, CourseDTO.class))
                .collect(Collectors.toList());
    }

    public Course getCourse(int id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isPresent()){
            return course.get();
        }
        return null;
    }

    public Optional<Course> getCourseById(int cid)
    {
        return courseRepository.findById(cid);
    }

    public CourseDTO updateCourse(CourseDTO course)
    {
        Optional<Course> optionalCourse = courseRepository.findById( course.getCourse_id());
        if(optionalCourse.isPresent()){
            Course  course1 = null;
            course1 = optionalCourse.get();
//            course1.setCourse_name(course.getCourse_name());
//            course1.setEnrolledStudents(course.getEnrolledStudents());
            Course cous = courseRepository.save(course1);
            return mapper.map(cous, CourseDTO.class);
        }else {
            return new CourseDTO();
        }
    }
}
