import java.util.Scanner;
public class subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		subwoofer box = new subwoofer();
		System.out.println("What is the height of your subwoofer box?");
		double height = kb.nextDouble();
		System.out.println("What is the width of your subwoofer box?");
		double width = kb.nextDouble();
		System.out.println("What is the length of your subwoofer box?");
		double length = kb.nextDouble();
		System.out.println("The Volume of your box is: " + box.volume(height, width, length));
	}
	public double volume(double height, double width, double length)
	{
		return (height*width*length);
	}
	
}