import java.io.BufferedWriter;
import java.util.*;
import java.io.*;

public class file_demo {
    public static void main(String[] args) throws Exception
    {
        try
        {   Scanner sc = new Scanner(new File("D:/s3DS/java/test.txt"));
            /*BufferedWriter Br = new BufferedWriter(new FileWriter("D:/s3DS/java/test.txt"));
            String a = sc.nextLine();
            Br.write("\n"+a);
            Br.close();*/
            
            
            String line;
            while((line =sc.nextLine())!=null)
            {
                System.out.println(line);

            }
            sc.close();


        
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
    
}
