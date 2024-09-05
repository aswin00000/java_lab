import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File.*;
import java.util.*;
public class BUffereddemo {
    public static void main(String[] args) throws Exception
    {   
        BufferedReader br = new BufferedReader(new FileReader("D:/s3DS/java/in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/s3DS/java/out.txt"));
        String a;
        while((a = br.readLine())!=null)
        {
            bw.write(a);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
    
}
