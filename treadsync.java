 class display
{
    public synchronized void printx(int x)

    {
        System.out.println(x);
    }
}

class odd extends Thread
{ int x;
    display d = new display();
    public odd(int x)
    {
        this.x=x;
    }
    public void run()
    {   int i =x;
        while(i!=0)
        {
            if(i%2!=0)
            {
                d.printx(i);
            }
            i--;

        }
    }

}

class even extends Thread
{ int x;
    display d = new display();
    public even(int x)
    {
        this.x=x;
    }
    public void run()
    {   int i =x;
        while(i!=0)
        {
            if(i%2==0)
            {
                d.printx(i);
            }
            i--;

        }
    }

}




public class treadsync {
    public void main (String args[])
    {
        even e = new even(100);
        odd o = new odd(100);

        e.start();
        o.start();

    }
    
}
