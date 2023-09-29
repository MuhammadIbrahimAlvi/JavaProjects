//import java.io.*;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class AirLineReservation implements Flight{
//
//    public String name;
//    public String email;
//    public String phoneNumber;
//    AirLineReservation(String name, String email, String phoneNumber) {
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
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
//    public boolean bookFlight(String name,String email,String PhoneNumber) throws ClassNotFoundException {
//        Class<?> c = Class.forName("Customer");
//        try {
//            HashMap<String, String> list = new HashMap<String, String>();
//            FileWriter myWriter = new FileWriter("CustomersInfo.txt",true);
//            list.put("Name",name);
//            list.put("Email",email);
//            list.put("Phone Number",phoneNumber);
//            myWriter.write(String.valueOf(list+",\n"));
//            myWriter.close();
//            System.out.println("Flight Booked.");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return true;
//    }
//    public boolean cancelFlight(String email){
//        try {
//            File myObj = new File("CustomersInfo.txt");
//            Scanner myReader = new Scanner(myObj);
//            String data;
//            while (myReader.hasNextLine()){
//                data = myReader.nextLine();
//                for (int i = 0;i<data.length();i++){
//                    String[] split = data.split(",");
//                    String value = split[0];
//                    String extractedEmail =  value.replace("{Email=","");
//                    if(email.equals((extractedEmail))){
//                        System.out.println("Equal Occured"+data);
//                    }else{
//                        System.out.println("Not Equal Occured");
//                        try{
//                            BufferedReader file = new BufferedReader(new FileReader("tmp.txt"));
//                            String line;String input = "";
//                            while ((line = file.readLine()) != null) input += line + '\n';
//                            System.out.println(input); // check that it's inputted right
////                          fw.write(String.valueOf((data) + ",\n"));
////                          fw.close();
//                        } catch (IOException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        return true;
//
//    }
//}
