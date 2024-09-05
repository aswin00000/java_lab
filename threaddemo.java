
public class threaddemo {
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<50; i++)
                {
                    if(i%2==0)
                    {
                        System.out.println(i);
                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int j=0; j<50; j++)
                {
                    if(j%2!=0)
                    {
                        System.out.println(j);
                    }
                }
            }
            
        });
        t1.start();
        t2.start();
    }
}
