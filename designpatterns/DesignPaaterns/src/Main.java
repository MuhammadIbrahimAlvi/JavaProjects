import singleton.SqlConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SqlConnection sqlConnection = SqlConnection.getSqlConnectionInstance();
        Connection connection = sqlConnection.getSqlConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employees");
        while (rs.next())
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        connection.close();
    }

}