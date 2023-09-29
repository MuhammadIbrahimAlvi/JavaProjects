package concurrentandsynchronizedhashmap;

import ConcurrentHashMap.ConcurrentHashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test extends Thread{

    private static Map<String,String> map = new ConcurrentHashMap<>();

    public static void main(String args[]) {
        map.put("name", "Ibrahim");
        System.out.println(map.get("name"));
        Thread thread = new Thread("thread1");
        Thread thread2 = new Thread("thread2");
        thread.start();
        thread2.start();
        System.out.println(map.get("name"));
    }

    @Override
    public void run(){
        map.put("name", "Alvi");
    }

}
