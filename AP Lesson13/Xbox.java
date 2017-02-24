public class Xbox extends Console 
{
	public Xbox()
	{
		super();
	}
	public Xbox(String x)
	{
		super(x);
	}
	public String getController()
	{
		return "\nXbox wireless controller";
	}
	public String getPlatform()
	{
		return "Xbox";
	}	
}