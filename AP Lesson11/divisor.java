import java.util.Scanner;
public class divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int [][]nums = new int [4][4];
		for(int i = 0;i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				nums[i][j] = 1 + (int)(Math.random()*100);
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("please enter a number");
		int divisor = kb.nextInt();
		int count = 0;
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums[i].length; j++)
			{
				if(nums[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array");
	}
}
