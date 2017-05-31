import java.util.Scanner;
public class cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		cube surf = new cube();
		System.out.println("What is the side length of one edge of your cube...");
		double length = kb.nextDouble();
		System.out.println("The SA of your cube is " + surf.calc(length));
		
		
	}	
	public double calc(double length)
	{
		return (length*length)*6.0; 
	}
	
}