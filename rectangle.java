//import Scanner 
import java.util.Scanner;
public class rectangle 
{
      public static void main(String[]args)	

	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length...");
		int l = kb.nextInt();
		System.out.println("please enter the height...");
		int w = kb.nextInt();
		int perimeter;
		print (calcperim(l,w));
	
	}
	
	public static int calcperim(int l, int w)
	{
		return (l+l+w+w); 
	}
    public static void print(int perimeter)
	{
		System.out.println("The permiter of your rectangle is... " + perimeter);
	}
}