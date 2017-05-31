public class Advance extends Ticket
{
	private int daysleft;
	public Advance()
	{
		daysleft = 1;
	}
	public Advance(int d)
	{
		daysleft = d; 
	}
	public double getPrice()
	{
		if(daysleft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}