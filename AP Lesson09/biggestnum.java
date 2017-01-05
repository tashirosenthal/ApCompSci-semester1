import java.util.Scanner;
public class biggestnum
{
	static int[] numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("The biggest number is...");
		getBiggest();
		
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
		for(int bob: numbers)
			{
				System.out.println(bob + " ");
			}
	}
	public static void getBiggest()
	{
		int max = 0;
		for(int num : numbers)
		{
			if(num >= max)
			{
				max = num;
				
			}
			
		
		}
		System.out.println(max);
	}
	
}