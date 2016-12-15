import java.util.Scanner;
public class countbyx
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you want to count by: ");
		int x = kb.nextInt();
		System.out.println("What do you want to count to: ");
		int y = kb.nextInt();
		for(int i = x; i <= y; i+=x)
		{
			System.out.printf("%10d\t", i);
		}
		
	}
}