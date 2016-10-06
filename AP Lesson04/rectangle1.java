import java.util.Scanner;
public class rectangle1 
{
	static double l,w;
	static double perimeter ;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	    rectangle1 perimeter = new rectangle1();
		System.out.println("What is the length of the rectangle?");
		l = kb.nextDouble();
		System.out.println("What is the width of the rectangle?");
		w = kb.nextDouble();
		calcperim();
		print();
	}
	public static void calcperim()
	{
	perimeter = (l+w+l+w);	
	}
	public static void print()
	{
		System.out.println("The perimeter of your rectangle is..." + perimeter);
	}
}