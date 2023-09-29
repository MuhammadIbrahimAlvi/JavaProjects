package Servlets;

import Students.StudentDao;
import Students.StudentInformation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ViewServlet")
public class ViewStudentServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<a href='index.html'>Add New Student</a>");
        out.println("<h1>Students List</h1>");

        List<StudentInformation> list= StudentDao.getAllStudents();

        out.print("<table border='1' width='100%'");
        out.print("<tr><th>Id</th><th>Roll Number</th><th>Name</th><th>Email</th><th>Courses</th><th>Year of Enrollment</th><th>Delete</th></tr>");
        for(StudentInformation e:list){
            out.print("<tr><td>"+e.getRollNumber()+"</td><td>"+e.getName()+"</td><td>"+e.getCourses()+"</td> <td>"+e.getYearOfEnrollment()+"</td><a href='EditServlet?id="+e.getRollNumber()+"'>edit</a></td> <td><a href='DeleteServlet?id="+e.getRollNumber()+"'>delete</a></td></tr>");
        }
        out.print("</table>");

        out.close();
    }
}  