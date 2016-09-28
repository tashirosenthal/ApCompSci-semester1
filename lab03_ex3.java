import java.util.Scanner;//import statement 

public class lab03_ex3

{
	public static void main(String[]args)
	{
	 //instantiate the new Scanner object "keyboard"
	Scanner keyboard = new Scanner(System.in);
	
	//promt for user input
	System.out.println("Please enter the heght of the prism.");
	
	//search for the next number the user inputs 
	double height = keyboard.nextDouble();
	
	//prompt for user input
	System.out.println("Please enter the width of the base of the prism.");
	
	//search for the next number the user enters
	double width = keyboard.nextDouble();
	
	//prompt for user input 
	System.out.println("Please enter the length of the base of the prism");
	
	//search for the next number the user enters
	double length = keyboard.nextDouble();
	
	//print the results
	System.out.println("The area of you prism	is..." +height*length*width);
	
	
	
	}
	
}	