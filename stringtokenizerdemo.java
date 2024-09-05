import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class stringtokenizerdemo {
    public static void main(String[ ] args) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        String A;

        FileReader fr = new FileReader("D:/s3DS/java/file1.txt");
        BufferedReader br = new BufferedReader(fr);

        while((A=br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(A," ");
            while(st.hasMoreTokens())
            {
                System.out.println(st.nextToken());
            }
        }

        fr.close();



      
        
        
    }
    
}
