package Filing;
import java.io.*;

public class InputStreaming {
    public static void main(String[] args){
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);

        System.out.println("Enter your name");
        try {
            String name = br.readLine();
            System.out.println("Welcome "+name);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
