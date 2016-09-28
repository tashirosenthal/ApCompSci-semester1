//import Scanner
import java.util.Scanner;
public class Aplab04
{ public static void main(String[]args)
	{
		//new APlab04 object
		Aplab04 receipt = new Aplab04();
		//new Scanner object 
	    Scanner kb = new Scanner(System.in);
		
		//3sets of variables - 1 for each item
		System.out.println("Please enter item1: ");
		String item1 = kb.nextLine();
		System.out.println("Please enter price: ");
		double price1 = kb.nextDouble();		
	    System.out.println("Please enter item2: ");
		String item2 = kb.next();
		System.out.println("Please enter price: ");
		double price2 = kb.nextDouble();		
		System.out.println("Please enter item3: ");
		String item3 = kb.next();
		System.out.println("Please enter price: ");
		double price3 = kb.nextDouble();		
		
		System.out.println("<<<<<<receipt>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		
		double subtotal = 18;
		receipt.format("subtotal", subtotal);
		double tax = 1.44;
		receipt.format("tax", tax);
		double total = 19.44;
		receipt.format("total", total);
		
	}
	    public void format(String item, double price)
	{
	   System.out.printf("\n%2s...... %10.2f", item, price );
	}
	
	
}