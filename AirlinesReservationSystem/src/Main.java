public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        System.out.println("<====Hello Welcome To Airline Reservation Management System====>");
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        System.out.println("How would you like to access this Software \n Enter 1 to use as Adminstrator \n Enter 2 to use as Customer");
//        String option = input.nextLine();
//        if(option.equals(1)){
//            System.out.println("Enter Name");
//            String name = input.nextLine();
//            System.out.println("Enter Email");
//            String email = input.nextLine();
//            System.out.println("Enter Phone Number");
//            String phoneNumber = input.nextLine();
//            System.out.println("Now Enter Option Number");
//            Admin objectAdmin = new Admin(name,email,phoneNumber);
//            objectAdmin.flightAttendantData();
//            System.out.println("Enter What you want to do?\n Enter 1 to Access all Flight Data. \n Enter 2 to Cancel Flight.");
//            String optionAdmin = input.nextLine();
//            switch (optionAdmin) {
//                case "2":
//                    objectAdmin.cancelFlight(email);
//                    break;
//                default:
//                    objectAdmin.flightAttendantData();
//                    break;
//            }
//        }
//        else{
//            System.out.println("Enter What you want to do?\n Enter 1 to book Flight. \n Enter 2 to Cancel Flight\n Enter 3 to Access your information");
//            System.out.println("Enter Name");
//            String name = input.nextLine();
//            System.out.println("Enter Email");
//            String email = input.nextLine();
//            System.out.println("Enter Phone Number");
//            String phoneNumber = input.nextLine();
//            System.out.println("Now Enter Option Number");
//            Customer customerObj = new Customer(name,email,phoneNumber);
//            String optionCustomer = input.nextLine();
//            switch (optionCustomer) {
//                case "1":
//                    customerObj.bookFlight(name, email, phoneNumber);
//                    break;
//                case "2":
//                    customerObj.cancelFlight(email);
//                    break;
//                default:
//                    System.out.println((customerObj.toString()));
//                    break;
//
//            }
//
//        }
        Serializtion obj = new Serializtion("Ibrahim",00);
        System.out.println("Serialization");
    }
}