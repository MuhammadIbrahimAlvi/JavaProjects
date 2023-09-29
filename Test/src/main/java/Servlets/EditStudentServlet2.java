//package Servlets;
//
//import Students.StudentDao;
//import Students.StudentInformation;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//@WebServlet("/EditServlet2")
//public class EditStudentServlet2 extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
//
//        String name=request.getParameter("name");
//        String rollNumber=request.getParameter("rollNumber");
//        String courses=request.getParameter("courses");
//        String yearOfEnrollment=request.getParameter("yearOfEnrollment");
//
//        StudentInformation e=new StudentInformation();
//        e.setName(name);
//        e.setRollNumber(rollNumber);
//        e.setRollNumber(courses);
//        e.setYearOfEnrollment(yearOfEnrollment);
//
//        int status= StudentDao.update(e);
//        if(status>0){
//            response.sendRedirect("ViewServlet");
//        }else{
//            out.println("Sorry! unable to update record");
//        }
//
//        out.close();
//    }
//
//}