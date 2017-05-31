public abstract class Ticket
{
	private int serialNo;
	public Ticket()
	{
		this.serialNo = 1 +(int)(Math.random()*9999999);
	}
	public int getSerialNo()
	{
		return serialNo;
	}
	public abstract double getPrice();
	public String toString()
	{
		return "\nSerial #: " + getSerialNo() + 
		"\nPrice: " + getPrice();
	}
}