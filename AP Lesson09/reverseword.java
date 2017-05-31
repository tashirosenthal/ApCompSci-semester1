import java.util.Scanner;
public class reverseword
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
		System.out.println("In order");
		for(String word : words)
		{
			System.out.println(word);
		}
		System.out.println();
		System.out.println("Reversed");
		reverse(words);
	}
	public static void reverse(String [] words)
	{
		for(int i = words.length -1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
	}
}
