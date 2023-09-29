package Tasks;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args){
      System.out.println("<== Task-5 ==>\n Q5) Write a program in java that counts the frequency of a perticular word(like \"Java\") in a text file. Word count is case-insensitive NOTE: Text file is already stored in local file system");
      System.out.println("Enter The input you would like to count frequency of:");
      Scanner input = new Scanner(System.in);
      String data = input.nextLine();
      try {
          FileReader file = new FileReader("Exployee.txt");
          BufferedReader readContent = new BufferedReader(file);
          String str = "";
          int i;
          int wordCount = 0;
          while ((i = readContent.read()) != -1) {
                  str += (char)i;
          }
          String temp = "";
          int frequencyCount = 0;
          for (int j = 0 ;j<str.length();j++){
              temp+=str.charAt(j);
              if(str.charAt(j)==' '){
                  temp = "";
              }else if(temp.equals(data)){
                  frequencyCount += temp.length();
                  wordCount++;
              }
          }

              System.out.println("Word is: "+ wordCount + " and frequency count is: "+ frequencyCount);
      }catch (IOException e){
          e.printStackTrace();
      }

    }
}
