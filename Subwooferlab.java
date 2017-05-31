import java.util.Scanner;
public class Subwooferlab
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Subwooferlab volume = new Subwooferlab();
		//prompt for user input
	    System.out.println("What is height of the box?");
		double height = kb.nextDouble();
		System.out.println("What is the length of the box?");
		double length = kb.nextDouble();
		System.out.println("What is the width of the box?");
		double width = kb.nextDouble();
		//method call
		System.out.println("The volume of the subwoofer box is..." + volume.calc(height, length, width )+"cubic feet");
		
	}
	 public double calc(double height, double length, double width)
	 {
		 return (height*length*height)/1728;
	 }
}