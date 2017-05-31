import java.util.Scanner;
public class retmethods02
{public static void main(String[]args)
	{
		//instantiate Scanner object
		Scanner kb = new Scanner(System.in);
		//initialize variables
		retmethods02 average = new retmethods02();
	    System.out.println("Please enter the first number.");
		int n = kb.nextInt();
		System.out.println("Please enter the next number.");
		int w = kb.nextInt();
		System.out.println("Please enter t he final number.");
		int r = kb.nextInt();
		calcAvg(n, w, r);
		print(calcAvg(n,w,r));
		
		
		
	}
      public static int  calcAvg(int n, int w, int r)
	{
     return (n+w+r)/3;
	
	}
	
		public static void print(int average)
	{
		System.out.printf("The average of your numbers is" + average);	
			
    }
	
}