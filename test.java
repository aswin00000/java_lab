import java.util.*;
public class test {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print fibnocii and pyramid");
        int n = sc.nextInt();
        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
             int n1= 0, n2 = 1, n3, k;
             synchronized(this)
             {
             System.out.print(n1+" "+n2);
             for(k =2; k<n; k++)
             {
                n3 = n2 +n1;
                System.out.print(" "+n3);
                n1 = n2;
                n2 = n3;
             }
            }}

        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                int x= 0;
                synchronized(this)
                {
                System.out.println("\n");
                for(int i= 1; i<= n; i++)
                {
                    x = i-1;
                    for(int j =i; j<=n-1; j++)
                    {
                        System.out.print(" ");
                        System.out.print("  ");
                    }
                
                for(int j =0; j<=n; j++)
                {
                    System.out.print((i + j)< 10 ? (i+j)+"  ":(i+j)+" ");
                }
                for(int j = 1; j<=n; j++)
                {
                    System.out.print((i+n-j)<10?(i+x-j)+"  ":(i+x-j)+" ");
                }
                System.out.println();}}
            }});
        
        t1.start();
        t2.start();
        
       


    }
}


