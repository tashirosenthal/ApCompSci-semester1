import java.util.Scanner;//import statement 

public class lab03_ex2

{
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter your weight.");
	double weight = keyboard.nextInt();
	System.out.println("Please enter your height.");
	double height = keyboard.nextInt();
	System.out.println("Your BMI is " +weight/(height*height)*703);

	}












}