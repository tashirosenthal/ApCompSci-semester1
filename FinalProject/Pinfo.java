import java.awt.Desktop;
import java.net.URI;
public class Pinfo implements Portal
{
	private String info;
	
	public Pinfo()
	{
		super();
		info = "";
	}
	public Pinfo(String i)
	{
		i = info; 
	}
	public static void getCancerTypes()
	{
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("http://bing.com"));
		
	}
}