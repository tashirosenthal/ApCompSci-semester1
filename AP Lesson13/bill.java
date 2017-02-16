public class bill extends Money
{
	private String face;
	
	public Bill()
	{
		super();
		face = "";

	}
	
	public Bill(String n, String f, double x)
	{
		super(n, v)
		face = f;
	}
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "face: " +face+ "\n" +
		super.toString();
	}
}