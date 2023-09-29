import JDBCConnection.DatabaseConnectivity;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectivity connection = new DatabaseConnectivity();
        try{
            connection.connecttoDB("StudentRecord","StudentsInfo");
            System.out.println("Enter Student Roll Number:");
            Scanner input = new Scanner(System.in);
            String inputRollNumber = input.nextLine();
            connection.fetchStudentInfo(inputRollNumber);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}