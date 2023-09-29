DROP TABLE IF EXISTS students;

CREATE TABLE students (
    student_id INTEGER AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(250) NOT NULL,
    course_list VARCHAR(250)
);

DROP TABLE IF EXISTS courses;

CREATE TABLE courses (
    course_id INTEGER AUTO_INCREMENT  PRIMARY KEY,
    course_name VARCHAR(250) NOT NULL,
    enrolledStudents VARCHAR(250)
);