package Students;
import java.util.*;
import java.sql.*;

public class StudentDao {
        public static Connection connectToDB() throws ClassNotFoundException {
            Connection con;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/StudentRecord","root","miarko123");
                System.out.println("Connected..!");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return con;
        }

        public static int insertRecord(StudentInformation e) throws ClassNotFoundException, SQLException {
        int status = 0;
        Connection con = StudentDao.connectToDB();
        PreparedStatement ps=con.prepareStatement("insert into StudentsInfo values(StudentName=?,rollNumber=?,courses=?,yearOfEnrollment=?)");
        ps.setString(1,e.getName());
        ps.setString(2,e.getRollNumber());
        ps.setString(3,e.getCourses());
        ps.setString(4,e.getYearOfEnrollment());

            System.out.println(ps+"<== ps");

        status=ps.executeUpdate();
            System.out.println("Status==>"+status);
        con.close();
        return status;
        }

//        public static int update(StudentInformation e){
//        int status=0;
//        try{
//            Connection con=StudentDao.connectToDB();
//            PreparedStatement ps=con.prepareStatement(
//                    "update StudentsInfo set name=?,rollNumber=?,courses=?,yearOfEnrollment=? where rollNumber=?");
//            ps.setString(1,e.getName());
//            ps.setString(2,e.getRollNumber());
//            ps.setString(3,e.getCourses());
//            ps.setString(4,e.getYearOfEnrollment());
//
//            status=ps.executeUpdate();
//
//            con.close();
//        }catch(Exception ex){ex.printStackTrace();}
//
//        return status;
//    }
    public static int delete(int rollNumber){
        int status=0;
        try{
            Connection con=StudentDao.connectToDB();
            PreparedStatement ps=con.prepareStatement("delete from StudentsInfo where rollNumber=?");
            ps.setInt(1,rollNumber);
            status=ps.executeUpdate();

            con.close();
        }catch(Exception e){e.printStackTrace();}

        return status;
    }
        public static StudentInformation getStudent(int rollNumber){
        StudentInformation e=new StudentInformation();

        try{
            Connection con=StudentDao.connectToDB();
            PreparedStatement ps=con.prepareStatement("select * from StudentsInfo where rollNumber=?");
            ps.setInt(1,rollNumber);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                e.setName(rs.getString(1));
                e.setRollNumber(Integer.parseInt(rs.getString(2)));
                e.setCourses(rs.getString(3));
                e.setYearOfEnrollment(rs.getString(4));
            }
            con.close();
        }catch(Exception ex){ex.printStackTrace();}

        return e;
    }
        public static List<StudentInformation> getAllStudents(){
        List<StudentInformation> list=new ArrayList<StudentInformation>();

        try{
            Connection con=StudentDao.connectToDB();
            PreparedStatement ps=con.prepareStatement("select * from StudentsInfo");
            ResultSet rs=ps.executeQuery();
            System.out.println(rs+"<== This is rs");
            while(rs.next()){
                StudentInformation e = new StudentInformation();
                e.setName(rs.getString(1));
                e.setRollNumber(Integer.parseInt(rs.getString(2)));
                e.setCourses(rs.getString(3));
                e.setYearOfEnrollment(rs.getString(4));
                list.add(e);
            }
            con.close();
        }catch(Exception e){e.printStackTrace();}

        return list;
    }
}
