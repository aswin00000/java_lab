class thread1
{
 
    public static void main(String[] args) throws Exception{
        ex t1 = new ex();
        crush t2 = new crush();
        t1.start();
        
        t2.start();
        
    }
}
class ex extends Thread{
     public void run()
    {  thread1 t = new thread1();
     t.displayodd();
    }
    }

class crush extends Thread{
    public void run()
    {   
        for(int j =0 ; j<50; j++)
       {
        if(j%2==0)
        {
            System.out.println(j);
        }
       }
    }
}