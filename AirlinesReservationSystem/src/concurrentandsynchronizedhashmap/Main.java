//package concurrentandsynchronizedhashmap;
//
//import java.util.Iterator;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class Main {
//    public static void main(String[] args){
//        System.out.println("<== Concurrent Vs Synchronized Hashmap ==>");
//
//        ConcurrentHashMap<String,String> list = new ConcurrentHashMap<String,String>();
//
//        list.put("1","Shahid");
//        list.put("2","Ibrahim");
//        list.put("3","Yousuf");
//
//        Test1 obj = new Test1();
//
//        obj.writeConcurrentHashMap(list);
//
//        obj.readConcurrentHashMap(list);
//
//    }
//}
//
//class Test1 extends Thread{
//
//    private Map<String, String> map = new ConcurrentHashMap<>();
//
////    public void run(){
////        System.out.println("Test1 class run method");
////    }
//
//    public void readConcurrentHashMap(ConcurrentHashMap obj){
////        Iterator iterationObj = obj.entrySet().iterator();
////        while(iterationObj.hasNext()){
////            System.out.println(iterationObj.next());
////        }
//    }
//    public void writeConcurrentHashMap(){
//        map.put("test","test1");
////        int objLength = obj.size();
////        for (int i =0;i<objLength;i++){
////            System.out.println("Enter Key");
////            java.util.Scanner input = new java.util.Scanner(System.in);
////            String key = input.nextLine();
////            System.out.println("Enter Value");
////            String value = input.nextLine();
////            obj.put(key,value);
//        }
//
//
//    @Override
//    public void run(){
//        writeConcurrentHashMap();
//        map.put("test","test12");
//    }
//}
//
////class Test2 extends Thread{
////    public void run(){
////        System.out.println("Test2 class run method");
////    }
////}
