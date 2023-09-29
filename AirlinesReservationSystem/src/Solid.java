//public class Solid {
//    public static void main(String[] args){
//        Student studentObj = new Student("Ibrahim","16");
//        System.out.println(studentObj.toString());
//    }
//}
////abstract class Person{
////    String name;
////    String standardClass;
////
////    abstract void read(String lang);
////}
//
//
//interface PayFees{
//    boolean submitted = false;
//     default boolean feeSubmission(int fees){
//                if(submitted)
//                {
//                    System.out.println("Fees Submitted of Student"+fees);
//                    return true;
//                }else{
//                    return false;
//        }
//    }
//}
//class Student extends Person implements PayFees{
//    private String studentId;
//    private String phoneNumber;
//
//    public int feesPaid = 0;
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Student(String studentName, String studentStandard){
//        name = studentName;
//        standardClass = studentStandard;
//    }
//
//    public String getStudentName() {
//        return name;
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getStudentStandard() {
//        return standardClass;
//    }
//
//    public String toString(){
//        return "The student name is: "+ name +" and study in Standard: "+ standardClass;
//    }
//
//    void read(String lang){
//        System.out.println("The student reads"+ lang);
//    }
//}
