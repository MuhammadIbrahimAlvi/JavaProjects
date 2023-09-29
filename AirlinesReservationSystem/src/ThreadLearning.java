//public class ThreadLearning {
//    public static void main(String[] args){
//        System.out.println("Threading in Java");
//        ThreadingExample obj1 = new ThreadingExample();
//        ThreadingExample obj2 = new ThreadingExample();
//        obj1.start();
//        obj2.start();
//        obj1.run("obj1");
//        obj2.run("obj2");
//        //        obj.start();
////        obj.run();
////        ABC objABC = new ABC();
////        Thread t1 = new Thread(objABC);
////        t1.start();
//    }
//}
//
////class ThreadingExample extends Thread{
////    public void run(String inst){
////        int a = 5;
////        int b = 5;
////        a = a+b;
////       for(int i=0;i<5;i++) {
////            try {
////                Thread.sleep(500);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////           System.out.println(inst +"is printing"+i);
////        }
////    }
////}
////
////class ABC implements Runnable{
////   public void run(){
////       System.out.println("Running");
////    }
////}