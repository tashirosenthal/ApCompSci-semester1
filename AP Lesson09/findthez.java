import java.util.Scanner;
public class findthez
{
	static String[]words = new String[5];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		fillArray();
		System.out.println("For the words: ");
		printArray();
		System.out.println("Only " + hasZs() + "contain(s) the letter z");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
			for(String word : words)
			{
				System.out.println(word + " ");
			}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
		}
		return zs;
	}
	
}