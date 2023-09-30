package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    private static SqlConnection sqlConnection;
    private static Object mutex = new Object();

    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";


    private SqlConnection() {

    }

    public static SqlConnection getSqlConnectionInstance(){
        SqlConnection sqlConnectionResult = sqlConnection;
        if (sqlConnectionResult == null) {
            synchronized (mutex) {
                sqlConnectionResult = sqlConnection;
                if (sqlConnectionResult == null)
                    sqlConnection = sqlConnectionResult = new SqlConnection();
            }
        }
        return sqlConnectionResult;
    }

    public Connection getSqlConnection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/"+ getEnvironmentVariables("databaseName"),
                getEnvironmentVariables("username"),
                getEnvironmentVariables("password"));

        return con;
    }

    private String getEnvironmentVariables(String variable) {
        return Dotenv.get(variable);
    }
}
