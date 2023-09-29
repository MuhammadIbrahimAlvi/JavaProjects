package Generics;

import java.util.ArrayList;

public class GenericsJava {
    public static void main(String[] args){
        System.out.println("<== Generics ==>");
        Employee<String> empOne = new Employee<>("Ibrahim","Computer Scientist","001");
        empOne.addSkills("Sql");
        empOne.addSkills("Java");
        empOne.addSkills("React");
        empOne.addSkills("React Native");
        empOne.addSkills("JavaScript");
        empOne.addSkills("MongoDb");
        empOne.addSkills("Express");
        empOne.addSkills("NodeJs");

        System.out.println(empOne.toString());
        System.out.println(empOne.getSkills());
    }
}

//class Test<T>{
//    T obj;
//    void add(T obj){
//        this.obj = obj;
//    }
//
//    T getObj(){
//        return this.obj;
//    }
//
//    public String toString(){
//        return "The Object is: "+ obj;
//    }
//
//}

//Generic Class
//This is the implementation of the Generic class where one class extends the parent specifying the type
class Person<T>{
    public String name;
    private T age;

    Person(String name){
        this.name = name;
    }

    public T setAge(T age){
        return this.age;
    }

    public String toString(){
        return "The name is:"+ this.name;
    }

}
class Employee<T> extends Person<T>{
    private String designation;
    private String empID;

    java.util.List<T> hobbies = new ArrayList<>();
    Employee(String name,String designation,String empID){
        super(name);
        this.designation = designation;
        this.empID = empID;
    }

     void addSkills(T ele){
        hobbies.add(ele);
    }
    java.util.List<T> getSkills(){
        return this.hobbies;
    }
    public String getDesignation() {
        return designation;
    }

    public String getEmpID() {
        return empID;
    }

    public String toString(){
        return "The Designation of an Employee is: "+ this.designation + " and his ID is:"+ this.empID+" and his skills are: "+this.hobbies;
    }
}