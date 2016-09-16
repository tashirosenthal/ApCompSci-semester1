import java.util.Scanner;//import statement 

public class lab03_ex2

{
	public static void main(String[]args)
	{
	 //instantiate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//promt for user input
	System.out.println("Please enter your weight.");
	
	//search for the next number the user enters
	double weight = keyboard.nextInt();
	
	//prompt for user input
	System.out.println("Please enter your height.");
	
	//search for the next number the user enters
	double height = keyboard.nextInt();
	
	//print the results
	System.out.println("Your BMI is " +weight/(height*height)*703);

	
		
		
		
		
		
		
	}












}