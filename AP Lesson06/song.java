import java.util.Scanner;
public class song
{
	public static void main(String[]args)
	{
		
		String word1 = "na";
		String word2 = "hey";
		String word3 = "Goodbye";
		int w1 = 4;
		int w2 = 3;
		int w3 = 1;
		sing(word1, w1);
		sing(word1, w1);
		sing(word2, w2);
		sing(word3, w3);
	}
	public static void sing(String word, int wordnum)
	{
			for(int i = 1; i <= wordnum; i++)
			{
				System.out.printf(word + " ");
			}
			System.out.println("");
	}
}