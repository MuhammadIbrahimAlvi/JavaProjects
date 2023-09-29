public class Hosiptal {
    public static void main(String[] args){
        System.out.println("<== Hospital Management ==>");
        Thread patientObj = new Patient();
        Thread staffObj = new Staff();
        Thread doctorObj = new Doctor();
        Thread politicianObj = new Politican();

        patientObj.start();
        staffObj.start();
        patientObj.run();
        patientObj.run();
        doctorObj.start();
        politicianObj.start();



    }
}

class Patient extends Thread{
    public void run(int id){
        System.out.println("The Patient no:"+id+" is being treated.");
    }
    public void start(){
        System.out.println("Started treatment of Patient.");
    }
}

class Staff extends Thread{
    public void run(int id){
        System.out.println("The Staff Memeber Patient no:"+id+" is being treated.");
    }
    public void start(){
        System.out.println("Started treatment of Staff.");
    }
}

class Doctor extends Thread{
    public void run(int id){
        System.out.println("The Doctor Memeber Patient no:"+id+" is being treated.");
    }
    public void start(){
        System.out.println("Started treatment of Doctor.");
    }
}


class Politican extends Thread{
    public void run(int id){
        System.out.println("The Politician Memeber Patient no:"+id+" is being treated.");
    }
    public void start(){
        System.out.println("Started treatment of Politician.");
    }
}