
	class Employee
	{  
		    
		  void display()
		   {
		       System.out.println("The class name is Employee\n");
		   }
		   void calc_salary()
		   {
		       System.out.println("the salary is 10000\n");
		   }
	}
		class Engineer extends Employee
		{
		    void calc_salary()
		     {
		         System.out.println("The salary is 20000\n");
		        super.calc_salary();
		     }
		}
	 public class empl
	 {
		    public static void main(String args[])
		   { 
		       Engineer c=new Engineer();
		     c.calc_salary();
		     c.display();
		   }

	  }