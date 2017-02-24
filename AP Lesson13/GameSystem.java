public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 1;
	}
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = 1 +(int)(Math.random()*9999999);
	}
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return serialNo;
	}
}