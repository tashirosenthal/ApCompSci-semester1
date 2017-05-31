import java.util.Scanner;
public class factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int w = kb.nextInt();
		int factorial = 1;
		for(int i = 1; i <= w; i++)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}
