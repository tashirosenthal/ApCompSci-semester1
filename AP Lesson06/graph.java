import java.util.Scanner;
public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int x = kb.nextInt();
		System.out.println("What do you want the size of the graph to be: ");
		int y = kb.nextInt();
		for(int i = 1; i <= y; i++)
		{
			System.out.printf("%10d | %10d\n", i, i * x );
		}
	}
}
