import java.util.Scanner;
public class rtri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		for(int i = word.length(); i >= 1; i--)
		{
			System.out.println(word.substring(1,i));
		}
	}
}
