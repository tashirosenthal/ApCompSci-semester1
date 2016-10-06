import java.util.Scanner;
public class circle1 
{ 
    static double r;
	static double area;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	    circle1 area = new circle1();
		System.out.println("What is the radius of the circle?");
		r = kb.nextDouble();
		
		
		
		
	}
	public static void calcarea()
	{
		area = (r*r)*3.14;
	}
	public static void print()
	{
	System.out.println("THe area of your circle is...");
	}
	

}