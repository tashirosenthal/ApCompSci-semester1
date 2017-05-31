import java.util.Scanner;
public class circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		circle area = new circle();
		System.out.println("Please enter the radius of the circle...");
		double radius = kb.nextDouble();
		System.out.println("The area of your circle is..." + area.calc(radius));
		
		
	}	
	public double calc(double radius)
	{
		return 3.14*(radius*radius);
	}
}