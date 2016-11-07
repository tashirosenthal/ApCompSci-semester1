import java.util.Scanner;
public class cube2 
{
	static double l;
	static double area;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	    cube2 area = new cube2();
		System.out.println("What is the length of one side of the cube?");
		l = kb.nextDouble();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = (l*l)* 6.0;
	}
	public static void print()
	{
		System.out.println("The surface area of your cube is: " + area);
	}
}

