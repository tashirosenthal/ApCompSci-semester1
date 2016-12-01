import java.util.Scanner;
public class lesson7s
{
	static String sentance;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentance");
		sentance = kb.nextLine();
			while(sentance.indexOf(" ") >= 0)
			{
				sentance = sentance.substring(0, sentance.indexOf(" ")) + sentance.substring(sentance.indexOf(" ")+1);
				
			}
		System.out.println("Without spaces... " + sentance);
	}
}