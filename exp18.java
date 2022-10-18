class Employee1
{ String name;
     int age;
     String number;
     String address;
     int salary;
   
    void printsalary()
    {
        
        System.out.println("Salary: "+salary);
    }
    
    
}
class officer extends Employee1
{
    String specialization;
}
class Manager extends Employee1
{
     String department;
}

public class exp18 
{

   public static void main(String[] args) 
   {
        officer e = new officer();
       e.name = "xyz";
       e.age = 23;
       e.number = "986**";
       e.address = "xyzxyz";
       e.salary = 1231;
       e.specialization = "xyzxyz";

       Manager m = new Manager();
       m.name = "xyz";
       m.age = 23;
       m.number = "986**";
       m.address = "xyzxyz";
       m.salary = 1231;
       m.department = "xyzxyz";
       System.out.println("Details of officer:");
       System.out.println("Name:"+e.name+"\n"+"Age:"+e.age+"\n"+"number:"+e.number+"\n"+"Address:"+e.address+"\n"+"specialisation:"+e.specialization);
       e.printsalary();
       System.out.println("Name:"+m.name+"\n"+"Age:"+m.age+"\n"+"number:"+m.number+"\n"+"Address:"+m.address+"\n"+"Department:"+m.department);
       m.printsalary();
   }

}