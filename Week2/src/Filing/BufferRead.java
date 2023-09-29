package Filing;
import java.util.*;
import java.io.*;

public class BufferRead {
        public static void main(String[] args){
            System.out.println("<== Buffer Reader Vs File Reader ==>");
            try{
            FileReader fr = new FileReader("Exployee.txt");
            BufferedReader br=new BufferedReader(fr);

            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            br.close();
            fr.close();}
            catch(IOException e){
                e.printStackTrace();
            }
        }
}
