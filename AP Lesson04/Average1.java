import java.util.Scanner;
public class Average1
{
	static double n, w, r;
	static double average;
	public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		Average1 average = new Average1();
	    System.out.println("Please enter the first number.");
		n = kb.nextDouble();
		System.out.println("Please enter the next number.");
		w = kb.nextDouble();
		System.out.println("Please enter t he final number.");
		r = kb.nextDouble();
		calcAvg();
		print();
	}
	public static void calcAvg()
	{
      average = (n+w+r)/3;
	}
		public static void print()
	{
		System.out.printf("The average of your numbers is" + average);		
    }
	
}