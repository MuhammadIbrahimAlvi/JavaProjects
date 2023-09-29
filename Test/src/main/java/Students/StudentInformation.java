package Students;

public class StudentInformation {
    private String StudentName;
    private int rollNumber;
    private String course;
    private String yearOfEnrollment;

    public String getName() {
        return StudentName;
    }

    public void setName(String name) {
        this.StudentName = name;
    }

    public String getRollNumber() {
        return String.valueOf(rollNumber);
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourses() {
        return course;
    }

    public void setCourses(String courses) {
        this.course = courses;
    }

    public String getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(String yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }



}
