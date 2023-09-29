import java.util.*;
public class WildCard {
    public static void returnPosition(List<? extends SoftwareEngineer> lists){
        for(SoftwareEngineer s:lists){
            s.returnDesignation();//calling method of Shape class by child class instance
        }
    }
    public static void main(String[] args){
        System.out.println("<== WildCard Implementation ==>");
        List<Backend> list1=new ArrayList<Backend>();
        list1.add(new Backend());

        List<FrontEnd> list2=new ArrayList<FrontEnd>();
        list2.add(new FrontEnd());
        list2.add(new FrontEnd());

        returnPosition(list1);
    }
}
abstract class SoftwareEngineer{
    abstract void returnDesignation();
}

class FrontEnd extends SoftwareEngineer{
    void returnDesignation(){
        System.out.println("The Designation of this employee is FrontEnd developer.");
    }
}


class Backend extends SoftwareEngineer{
    void returnDesignation(){
        System.out.println("The Designation of this employee is BackEnd developer.");
    }
}

class QaTester extends SoftwareEngineer{
    void returnDesignation(){
        System.out.println("The Designation of this employee is QA Tester.");
    }
}