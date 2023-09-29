//import java.io.*;
//import java.util.Scanner;
//
//public class Admin extends AirLineReservation{
//    public String name;
//    public String email;
//    public String phoneNumber;
//    Admin(String name, String email, String phoneNumber) {
//        super(name,email,phoneNumber);
//        }
//    public void flightAttendantData(){
//        try {
//            File myObj = new File("CustomersInfo.txt");
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//}
