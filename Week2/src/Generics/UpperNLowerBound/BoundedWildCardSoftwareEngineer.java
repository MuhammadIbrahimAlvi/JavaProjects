package Generics.UpperNLowerBound;

import java.util.List;
import java.util.ArrayList;

public class BoundedWildCardSoftwareEngineer {
    public static void main(String[] args){
        System.out.println("<== Software Engineer Bounded WildCard ==>");
        List<BackEndDev<String>> employeeList = new ArrayList<>();
        BackEndDev<String> backendDev = new BackEndDev<>();

        backendDev.addSkills("Java");
        backendDev.addSkills("php");
        backendDev.addSkills("Sql");

        employeeList.add(backendDev);

        System.out.println(employeeList.toString());

    }
}

class SoftwareEngineer{
    private boolean isBachelored;
    private boolean isMastered;

    public boolean isBachelored() {
        return isBachelored;
    }

    public boolean isMastered() {
        return isMastered;
    }

    public void setBachelored(boolean bachelored) {
        isBachelored = bachelored;
    }

    public void setMastered(boolean mastered) {
        isMastered = mastered;
    }
}

class FrontEndDev <T> extends SoftwareEngineer{
    List<T> skills = new ArrayList<>();

    void addSkills(T ele){
        skills.add(ele);
    }

    List<T> returnSkills(){
        return skills;
    }

    public <N extends Number> double getBonus(N extraHoursWorked){
        double bonus = 0;
        bonus = extraHoursWorked.doubleValue()*skills.size();
        return bonus;
    }
    public String toString() {
        return "The designation is FrontEnd Developer and skills are "+ skills;
    }
}


class BackEndDev <T> extends SoftwareEngineer{
    List<T> skills = new ArrayList<>();

    public <N extends Number> double getBonus(N extraHoursWorked){
        double bonus = 0;
        bonus = extraHoursWorked.doubleValue()*skills.size();
        return bonus;
    }

    void addSkills(T ele){
        skills.add(ele);
    }

    List<T> returnSkills(){
        return skills;
    }

    @Override
    public String toString() {
        return "The designation is Backend Developer and skills are "+ skills;
    }
}
