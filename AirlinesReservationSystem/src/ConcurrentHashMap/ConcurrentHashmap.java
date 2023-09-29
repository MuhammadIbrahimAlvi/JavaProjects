package ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap<S, S1> {
    public static void main(String[] args){
        System.out.println("<== Concurrent HashMap ==>");
        ConcurrentHashMap<Integer,String> freelancerIDList = new ConcurrentHashMap<Integer, String>();
        Freelance freelnacer = new Freelance();
        freelancerIDList.put(1,freelnacer.getFreelanceID());
        freelancerIDList.put(2,freelnacer.getFreelanceID());
        freelancerIDList.put(3,freelnacer.getFreelanceID());

        System.out.println(freelancerIDList);
    }
}

class Freelance extends Thread{
    public void run(){
        System.out.println("Work started of" +Thread.currentThread().getName());
    }

    public String getFreelanceID(){
        return Thread.currentThread().getName();
    }
}
