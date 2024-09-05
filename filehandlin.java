
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
public class filehandlin {
    public static void main(String [] args) throws Exception
    {
        File obj = new File("D:/s3DS/java/test.txt");
        Scanner Reader = new Scanner(obj);
        // File ob2 = new File("D:/s3DS/java/test2.txt");
        // FileOutputStream fout = new FileOutputStream(ob2);   
        
        while(Reader.hasNextLine())
        {
             String data = Reader.nextLine();
            
             StringTokenizer st = new StringTokenizer(data);
          while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            // System.out.println(data);
            
        }
        }
        Reader.close();
    
}}
