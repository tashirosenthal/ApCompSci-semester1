import java.util.Scanner;
public class password 
{
	static Scanner kb;
	public static void main(String[]args)
	{
		 kb = new Scanner(System.in);
		 recursion();
	}
	public static void recursion()
	{ 
	     System.out.println("Please enter your username.");
	     String user = kb.next();
		 System.out.println("Please enter your password.");
		 String pass = kb.next();
		
		
		if(user.equals("tashirosenthal"))
		{
			 System.out.println("Username is correct");
				if(pass.equals("tashi101"))
			{
				System.out.print("Password is correct");
			}
			else
			{	 
				System.out.println("Your Password is incorrect please try again.");
				recursion();
			}
		 }	
		 else 
		 {
			 System.out.println("Username is incorrect");
			 System.out.println("Please enter your passwrd.");
				if(pass.equals("tashi101"))
				{
					System.out.println("Your password is correct but your user name is not please try again");
					recursion();
				}
			 else
			 {
				 System.out.println("Your username and password are  wrong please try again.");
			     recursion();
			 }
		 }
		
	}
}