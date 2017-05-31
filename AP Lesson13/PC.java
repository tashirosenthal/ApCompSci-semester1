public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	public PC(String platform)
	{
		super(platform);
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String toString()
	{
		return "Platform " + super.getPlatform() +
		" Serial #:" + super.getSerialNo() +
		" System Input" + systemInput();
	}	
}
