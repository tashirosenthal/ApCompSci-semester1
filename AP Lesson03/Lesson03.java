import java.util.Scanner; //import Statement

public class Lesson03
{
	
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//promt for user input
		System.out.println("how old are you?");
		
		//search for the nexr integer the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow! " + num + " is perfect. You're pretty handsome.");
		
		//search for the next string that user inputs
		String name = keyboard.next();
		
		
		
	}
	
	
	
	
	
}