abstract class Shape

{
      abstract void numberofsides();
}
class Rectangle extends Shape

{
	void numberofsides()
	{
		System.out.println("Number of sides of Rectangle is : 4");
	}
}

class Triangle extends Shape

{

	void numberofsides()
	{
		System.out.println("Number of sides of Triangle is : 3");
    }
}
class Hexagon extends Shape

{
	void numberofsides()

	{
		System.out.println("Number of sides of Hexagon is : 6");
	}
}
public class exp19
{
	public static void main(String args[])
	{
		Shape s;
        s=new Rectangle();
        s.numberofsides();
        s=new Triangle();
        s.numberofsides();
        s=new Hexagon();
        s.numberofsides();                       
	}
}