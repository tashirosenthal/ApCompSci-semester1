import java.util.Scanner;
public class average 
{public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		average average = new average();
		
		System.out.println("What is the first number");
		int n1 = kb.nextInt();
		System.out.println("What is the first number");
		int n2 = kb.nextInt();
		System.out.println("What is the first number");
		int n3 = kb.nextInt();
		double avg = average.calcAvg(n1, n2,n3);
		System.out.println("The average of your numbers is " + avg);
		
	}
      public double calcAvg(int one, int two, int three)
	{
      return (one+two+three)/3.0;
	}
}