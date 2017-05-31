import java.util.Scanner;
public class treedegree
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.nextLine();
		int stop = word.length();
		int start = 0;
		tree(word, stop, start);
	}
	public static String tree(String word, int stop, int start)
	{
       if(start <= stop)
	   {
		   System.out.printf("%20s\n", word.substring(0, start));
		   return tree(word, stop, start + 1);
	   }
	   return "";
	}
}