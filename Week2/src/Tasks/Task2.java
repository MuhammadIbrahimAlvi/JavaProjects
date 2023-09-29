package Tasks;
import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        System.out.println("<== Task-2 ==> \n Q.2)Write a program to print list of all files present in a particular folder in a file system. \n Q.3)Write a program to print list of all files present in a particular folder in a file system, according to a particular file format like (xlsx, pptx etc).");
        File directory=new File("src");
        File[] files = directory.listFiles();
        System.out.println("File Paths:"+ Arrays.toString(files) + " Files Length: "+files.length);
    }
}
