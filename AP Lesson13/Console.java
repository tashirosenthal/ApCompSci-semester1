public abstract class Console extends GameSystem
{
	String Controller;
	public Console()
	{
		super();
	}
	public Console(String C)
	{
		super(C);
	}
	public abstract String getController();
	public String toString()
	{
		return "Platform: " + super.getPlatform() +
		"Serial#: " + super.getSerialNo() + 
		"Controller" + getController();		
	}
}
