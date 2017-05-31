public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket w = new Walkup();
		Ticket a = new Advance(16);
		Ticket x = new Advance(8);
		Ticket n = new StudentAdvance(4);
		Ticket s = new StudentAdvance(12);
		System.out.println("Walk up price :" + w);
		System.out.println("Advance for early price: " + a);
		System.out.println("Advance for late price: " + x);
		System.out.println("Advance price for late students" + n);
		System.out.println("Advance price for early students" + s);
	}
}