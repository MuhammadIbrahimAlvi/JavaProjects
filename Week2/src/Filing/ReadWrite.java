package Filing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class ReadWrite {
        public static void main(String[] args){
            System.out.println("<== Read And Write File ==>");
            java.util.Map<String,BackEndDev> listDevs = new HashMap<>();
            java.util.Map<String,FrontEndDev> listFrontEnd = new HashMap<String,FrontEndDev>();
//            java.util.Map<String,BackEndDev> listBackEnd1 = new HashMap<String,BackEndDev>();

            //            List<BackEndDev> listBack = new ArrayList<>();
            BackEndDev<String> backendDev1 = new BackEndDev<>();
            FrontEndDev<String,Number> frontEndDev1 = new FrontEndDev<>();
            frontEndDev1.addBonuses(50000);
            frontEndDev1.addSkills("React");
            frontEndDev1.addSkills("MERN");

            backendDev1.addSkills("Sql");
            backendDev1.addSkills("Java");
            backendDev1.addSkills("Mern");
            listDevs.put("1",backendDev1);
            listFrontEnd.put("1",frontEndDev1);

//            listFrontEnd.put(1,)

            File file = new File("Exployee.txt");
            try {
                file.createNewFile();
                FileWriter myWriter = new FileWriter("Exployee.txt",true);
                myWriter.append(String.valueOf(listDevs));
                myWriter.append(String.valueOf(frontEndDev1));
                myWriter.close();
                System.out.println("Successfully wrote to the file.");

            }catch (IOException e){
                System.out.println(e);
            }

            try{
                Scanner readObj = new Scanner(file);
                while(readObj.hasNextLine()){
                    String data = readObj.nextLine();
                    System.out.println("The data is==> "+data);
                }
                readObj.close();
            }catch (IOException e){
                e.printStackTrace();
            }

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

class FrontEndDev <T,N> extends SoftwareEngineer {
    List<T> skills = new ArrayList<>();
    List<N> bonuses = new ArrayList<>();
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
    public void addBonuses(N bouns){
        bonuses.add(bouns);
    }

    public List<N> getBonuses(){
        return bonuses;
    }

    public String toString() {
        return "The designation is FrontEnd Developer and skills are "+ skills +" and his bonuses are "+ bonuses;
    }
}


class BackEndDev <T> extends SoftwareEngineer {
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
