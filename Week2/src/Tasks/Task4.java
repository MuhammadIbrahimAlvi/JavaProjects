package Tasks;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("<== Task-4 \n Q4.) Write a program in java to copy all contents of a text file and paste in another text file and store the second text file.==>");
        try {
            File file = new File("Exployee.txt");
            if (file.exists()) {
                System.out.println("File Exists..! \nNow Reading Data..!");
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);
                FileWriter myWriter = new FileWriter("NewData.txt", false);
                int i;
                while (( i = bufferedReader.read()) != -1) {
                    // Storing every character in the string
                    myWriter.write(bufferedReader.readLine());
                    myWriter.write("\n");
                }
                System.out.println("Written into other file Successfully");
                myWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
