package ThreadTaask;

public class ThreadPractice extends Thread{
    public static void main(String args[]){
        ThreadPractice Main = new ThreadPractice();
        ThreadPractice Thread1 = new ThreadPractice();
        ThreadPractice Thread2 = new ThreadPractice();
        Main.start();
        Thread1.start();
        try{
            Thread1.sleep(1000);
            System.out.println("Sleeping"+currentThread().getId());
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        Thread2.start();
        try{
            Thread2.sleep(1000);
            System.out.println("Sleeping"+currentThread().getId());
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        Thread2.stop();
        Thread1.stop();
        Main.stop();
    }
    @Override
    public void run(){
        System.out.println("Started..!"+currentThread().getId());
    }

}
