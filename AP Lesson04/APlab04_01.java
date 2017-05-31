//import Scanner
import java.util.Scanner;
public class APlab04_01
{ public static void main(String[]args)
	{
		//new APlab04_01 object 
		APlab04_01 idcard = new APlab04_01();
		//new scanner object 
		Scanner kb =  new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String first = kb.nextLine();
		System.out.println("Please enter your last name:");
		String last = kb.next();
		System.out.println("Please enter your title:");
		String title = kb.next();
		System.out.println("Please enter the school site:");
		String school = kb.next();
		kb.nextLine();
		System.out.println("Please enter the year:");
		String year = kb.nextLine();
		System.out.println("Please enter your favorite subject");
		String subject = kb.next();
		
		System.out.println("***********************************");
		idcard.format(first, last);
		idcard.format(title , school);
		idcard.format(year, subject);
		
		
	}
     public void format(String first, String last)
	 {
		    System.out.printf("\n%10s \t%50s", first, last );
	 }
}