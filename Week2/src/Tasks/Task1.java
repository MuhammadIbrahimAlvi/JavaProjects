package Tasks;
import java.io.*;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Task1 {
    public static void main (String[] args){
        System.out.println("<== Task-1 ==> \n Q.1.) Take data from input and write it into the file.");
        File file = new File("TaskOne.txt");

//        InputStreamReader input = new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(input);
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter fileWrite = new FileWriter(file,true);
            System.out.println("Enter Name");
            String name = scanner.next();
            fileWrite.write("The Employee Name is: "+name);
            fileWrite.close();
            scanner.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
