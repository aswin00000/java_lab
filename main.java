import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 0){
                throw new InvalidAgeException("Age cannot be negative");
            }
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
