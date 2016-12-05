import java.util.Scanner;
public class center
{
	
	public static void main(String[]args)
    {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String w1 = kb.next();
		System.out.println("Please enter another word: ");
		String w2 = kb.next();
		System.out.println("Please enter the last word: ");
		String w3 = kb.next();
		center(w1);
		center(w2);
		center(w3);
		
	}
	public static String center(String word)
	{
		if(word.length() >= 20)
		{
			System.out.println(word);
		}
		else 
		{
			return center(" " + (word) + " ");
		}
			return "";
		
	}
}