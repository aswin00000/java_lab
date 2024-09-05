import java.util.*;

class node{
    int data;
    node link;
    node(int data)
    {
        this.data = data;
        link = null;
    }
    
}

class Queue
{
    node head;
    node tail;
    Queue(){
        head=null;
        tail=null;
    }
    void push(int data)
    {
        node temp = new node(data);
        if(tail!=null)
        {
            tail.link = temp;
        }
        tail = temp;
        if(head ==null)
        {
            head = tail;
        }
        
    }
    int pop()
    {
      if(head==null)
      {
        System.out.println("Queue is empty");
        return -1;
      }
      int da = head.data;
      head=head.link;

      if(head ==null)
      {
        tail = null;
      }
      return da;
    
    }
    
}




public class linked {
    public static void main(String agrs[])
    {
      Scanner sc = new Scanner(System.in);
      Queue q = new Queue();

      int ch,pass;
      while(true){
      System.out.println("1.push\n2.pop\n3.exit\n");
      ch = sc.nextInt();
     
      switch(ch)
        {
            case 1:
                 System.out.println("enter the number");
                 pass = sc.nextInt();
                 q.push(pass);
                 break;
                 
            case 2:  
                 pass = q.pop();
                 System.out.println("dell "+pass);
                 break;

            case 3:  
                  
                 break;     


                
        }}
    }
    
}
