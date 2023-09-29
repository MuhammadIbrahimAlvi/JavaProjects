//public class ShapeAreas {
//    public static void main(String[] args){
//        System.out.println("<== Shapes Measurements ==>");
//        Shape shapeObj = new Circle();
//        System.out.println(shapeObj.calculateArea());
//
////        Circle c = new Circle();
////        System.out.println(c.calculateArea());
//
//    }
//}
//// 1. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Compile-Time polymorphism.
////   HINT: You can Use only one method name for calculating area of all the shapes - e.g:"calculateArea()"
////   Limitations: Inheritance is not allowed.
////class Shape{
////    private static final Integer TWO = 2;
////    public double calculateArea(int radius){
////        System.out.println(Math.PI * Math.pow(radius,TWO)+"<===== Area of Circle");
////        return Math.PI * Math.pow(radius,TWO);
////    }
////    public int calculateArea(int length,int width){
////
////        System.out.println(length * width+"<===== Area of Rectangle");
////        return length * width;
////    }
////    public double calculateArea(long base,long height){
////        System.out.println(1/2 * (base*height)+"<===== Area of Triangle");
////        return 1/2 * (base*height);
////    }
////}
//
//// 2. Write a program in java that computes the areas of Circle, Triangle and Rectangle using Run-Time polymorphism.
//// HINT: 1. You can Use only one method name for calculating area of all the shapes - e.g:"calculateArea()".
//// 2. Inheritance is allowed.
//
//class Shape{
//    protected double calculateArea(){
//        System.out.println("shape class");
//        return 1;
//    }
//}
//class Circle extends Shape{
//    protected double calculateArea(){
//        System.out.println("test circle");
//        return 1;
////        System.out.println(Math.PI * Math.pow(radius,2)+"<===== Area of Circle");
////        return Math.PI * Math.pow(radius,2);
//    }
//}
//
//class Triangle extends Shape{
//    public double calculateArea(long base,long height){
//        System.out.println(1/2 * (base*height)+"<===== Area of Triangle");
//        return 1/2 * (base*height);
//    }
//}
//
//class Rectangle extends Shape{
//    public int calculateArea(int length,int width){
//        System.out.println(length * width+"<===== Area of Rectangle");
//        return length * width;
//    }
//}
//
////3. Write a program in java to implement abstraction,
//// the program should have two classes "Person" and "Employee"
//// but it should not expose the details of "Person" class by using Abstraction.
//
//abstract class Person{
////    private String Name;
////    private int age;
//    abstract String name();
//
//
////    public String getName() {
////        return Name;
////    }
////
////    public void setName(String name) {
////        Name = name;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }
//}
////
//class Employee extends Person{
//    private boolean isEmployed;
//    private String designationOfEmployee;
//    private int employeeID;
//    public Employee(String designationOfEmployee,int employeeID,boolean isEmployed){
//        this.designationOfEmployee = designationOfEmployee;
//        this.employeeID = employeeID;
//        this.isEmployed = isEmployed;
//    }
//
//    @Override
//    boolean isEmployed() {
//        if(isEmployed){
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    String name() {
//        return null;
//    }
//}