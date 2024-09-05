import java.util.Random;

class RandomTread extends Thread
{ 
    public void run()
    {
        Random r = new Random();
        for(int i =0; i<20; i++)
        {
            int n = r.nextInt(100);
            if(n%2==0)
            {
                new even(n).start();
            }
            else{
                new odd(n).start();
            }
        }
    }
}
class odd extends Thread{
    int num;
    odd(int num)
    {
        this.num = num;
    }

    public void run()
    {
        System.out.println("cube of "+num+"is "+num*num*num);
    }
    
    
}


class even extends Thread{
    int num;
    even(int num)
    {
        this.num = num;
    }

    public void run()
    {
        System.out.println("square of "+num+"is "+num*num);
    }
    
    
}








public class treaddemo {
    public static void main(String args[])
    {
      RandomTread r = new RandomTread();
      r.start();
    }
    
    
}
