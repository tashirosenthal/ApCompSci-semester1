import java.util.Scanner; 
import java.util.Arraylist;
public class Portal
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the integer number of the TCGA number on the list that you would like information from");
		int TCGA = kb.nextint();
        if(TCGA == 1)
		{
			System.out.println("We have information on this Number would you like to view the mutations? ");
			String h = kb.next();
			if(h.equals("Yes"))
			{
				getMutations();
			}
		}
	}
}