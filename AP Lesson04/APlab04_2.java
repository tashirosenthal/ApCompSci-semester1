import java.util.Scanner;
public class APlab04_2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		APlab04_2 monthly = new APlab04_2();
		// prompt for user input
		System.out.println("What is the rate of the investment?");
		double r = kb.nextDouble();
		System.out.println("What is the principal of the item purchased?");
		double p = kb.nextDouble();
		System.out.println("What is the time of the investment?");
		double t = kb.nextDouble();
		System.out.println("what is the number of the investment?");
		double n = kb.nextDouble();
		//method call
		System.out.println("Your monthly payment will be" + monthly.payment(r, p, n, t));
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return p*(Math.pow(1+r/n, n*t))/(t*12);
	}
}