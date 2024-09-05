 import java.util.*;

class DoublyLinkedList
{ 
   private node head;
   class node
  {
    int data;
    node left;
    node right;
   
   public node(int data)
   {
    this.data = data;
    this.left = null;
    this.right = null;
   }

  }
  
  public void insertAtEnd(int data)
  { node temp = new node(data);
    if(head==null)
    {
        head = temp;
    }
    else
    {   node ptr = head;
        while(ptr.right!=null)
        {
            ptr = ptr.right;
        }
        ptr.right=temp;
        temp.left= ptr;
    }
    System.out.println(data+"is added to list");
  }

  public int deleteAtFront()
  {
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else 
    {
        int data = head.data;
        head = head.right;
        head.left = null;
        System.out.println(data+"is deleted from the list");
    }
    return -1;
  }

  public void display()
  {
    node temp = head;
    if(head == null)
    {
        System.out.println("List empty");

    }
    else{
        while(temp!=null)
        {
            System.out.println(temp.data+"\t");
            temp = temp.right;
        }
    }
  }


}




public class doubly {

    public static void main(String args[])
    {
        DoublyLinkedList dl = new DoublyLinkedList();
        int ch=0;
        while(ch!=4)
        {
            System.out.println("1.insert\n2.delete3.display\n4.exit");
            Scanner sc =new Scanner(System.in);
            ch = sc.nextInt();
            sc.nextLine();

            switch(ch)
              {
            case 1:
                 System.out.println("enter the number");
                 int pass = sc.nextInt();
                 dl.insertAtEnd(pass);
                 
                 break;
                 
            case 2:  
                 dl.deleteAtFront();
                 
                 break;

            case 3:
                   dl.display();  
                  
                 break; 
            case 4:
                  break;    
                }
        }
    
        }    }
