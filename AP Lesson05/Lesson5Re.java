import java.util.Scanner;
public class Lesson5Re
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your first item?");
		String item1 = kb.next();
		System.out.println("What is the price of your first item?");
		double price1 = kb.nextDouble();
		System.out.println("What is your second item?");
		String item2 = kb.next();
		System.out.println("What is the price of your second item?");
		double price2 = kb.nextDouble();
		System.out.println("What is your third item?");
		String item3 = kb.next();
		System.out.println("What is the price of your third item");
		double price3 = kb.nextDouble();
		System.out.println("What is your fourth item?");
		String item4 = kb.next();
		System.out.println("What is the price of your fourth item?");
		double price4 = kb.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount =calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = discount + tax;
		
		System.out.println("<<<<<< receipt >>>>>>");
		
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		
		
		System.out.println("Subtotal = " + subtotal);
		System.out.println("Discount = " + discount);
		System.out.println("Tax = " + tax);
		System.out.println("Total = " + total);
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.println("______________________");
		System.out.println("Thank You!");
		
	}
	public static double calcDisc(double sub)
	{
		if(sub >= 2000)
			return sub * 0.15;
		return 0.0;
	}
	public static void format(String item, double price)
	{
		
	}
	
	
}