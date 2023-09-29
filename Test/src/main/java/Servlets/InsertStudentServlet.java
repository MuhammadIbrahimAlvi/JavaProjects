package Servlets;

import Students.StudentDao;
import Students.StudentInformation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertStudentServlet")
public class InsertStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("StudentName");
        int rollNumber= Integer.parseInt(request.getParameter("RollNumber"));
        String courses=request.getParameter("courses");
        String yearOfEnrollment=request.getParameter("yoe");
        System.out.println(name+" "+rollNumber+" "+courses+" "+yearOfEnrollment);
        StudentInformation e=new StudentInformation();
        e.setName(name);
        e.setRollNumber(Integer.parseInt(String.valueOf(rollNumber)));
        e.setCourses(courses);
        e.setYearOfEnrollment(yearOfEnrollment);

        int status= 0;
        try {
            status = StudentDao.insertRecord(e);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        if(status>0){
            out.print("<p>Record saved successfully!</p>");
            request.getRequestDispatcher("index.html").include(request, response);
        }else{
            out.println("Sorry! unable to save record");
        }

        out.close();
    }

}