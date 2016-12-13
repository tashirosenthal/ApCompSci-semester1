import java.util.Scanner;
public class firstletter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		reverseword reverse = new reverseword();
		System.out.println("Please enter 5 words");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	public static void first(String [] words)
	{
		for(String word : words)
		{
			System.out.println(word.substring(0,1));
		}
	}
}
