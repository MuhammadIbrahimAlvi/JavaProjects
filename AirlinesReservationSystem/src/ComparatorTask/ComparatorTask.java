//package ComparatorTask;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//
//
//public class ComparatorTask {
//    public static void main(String[] args){
//        System.out.println("<== Comparator Task ==>");
//        ArrayList<Employee> arrayList = new ArrayList<Employee>();
//        arrayList.add(new Employee("Shahid","backend001",26));
//        arrayList.add(new Employee("Yousuf","automation001",30));
//        arrayList.add(new Employee("Ibrahim","backend002",22));
//
//        for(Employee st: arrayList){
//            System.out.println(st.empID+" "+st.name+" "+st.age);
//        }
//        java.util.Collections.sort(arrayList,new NameComparator());
//        System.out.println("Sorted by Name");
//        for(Employee st: arrayList){
//            System.out.println(st.empID+" "+st.name+" "+st.age);
//        }
//    }
//}
//class NameComparator implements Comparator<Employee> {
//    public int compare(Employee s1,Employee s2){
//        return s1.name.compareTo(s2.name);
//    }
//}
//class AgeComparator implements Comparator<Employee> {
//    public int compare(Employee s1,Employee s2){
//        return s1.age.compare(s2.age);
//    }
//}
//class Employee{
//    int age;
//    String name;
//    String empID;
//
//    Employee(String name,String empID,int age){
//        this.name = name;
//        this.age = age;
//        this.empID = empID;
//    }
//}
