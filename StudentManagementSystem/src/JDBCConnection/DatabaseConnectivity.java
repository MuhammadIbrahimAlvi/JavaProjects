package JDBCConnection;
import java.sql.*;

public class DatabaseConnectivity {

    private Connection con;
    private Statement stmt;
    public void connecttoDB(String databaseName,String tableName) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/"+databaseName,"root","miarko123");
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from "+tableName);
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            System.out.println("Connected..!");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void fetchStudentInfo(String rollNumber) throws SQLException {
        ResultSet rs = stmt.executeQuery("select * from StudentsInfo where rollNumber = "+ rollNumber);
        while(rs.next())
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
        con.close();
    }

}
