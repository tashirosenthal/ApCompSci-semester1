import java.util.Scanner;
public class getodds
{
	static int[]numbers = new int[10];
	public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);
			fillArray();
			System.out.println("For the following numbers: ");
			printArray();
			System.out.println("\n The odd numbers are" );
			getOdds();
		}
		public static void fillArray()
		{
			for(int i = 0; i < 10; i++)
			{
				numbers[i] = 1 + (int)((Math.random()*101));
			}
		}
	    public static void printArray()
		{
			for(int elfs: numbers)
			{
				System.out.println(elfs + " ");
			}
		}
		public static void getOdds()
		{
			for(int num : numbers )
			{
				int odds = 0;
				if(num % 2 == 1)
				{
					System.out.println(num + " ");
				}
				
			}
			
		}
}