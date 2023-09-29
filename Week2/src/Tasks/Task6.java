package Tasks;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Task6 {
    public static void main(String[] args){
        System.out.println("<== Task-6 ==> \n Enhance the above program to count the frequency of all words in the same text file.");
        try{
            File file = new File("Exployee.txt");
            Scanner input = new Scanner(file);
            int count = 0;
            while (input.hasNext()) {
                String word = input.next();
                System.out.println(word);
                count = count + 1;
            }
            System.out.println("The word count is:"+count);
        }catch(IOException e){
                e.printStackTrace();
            }

        }

}
