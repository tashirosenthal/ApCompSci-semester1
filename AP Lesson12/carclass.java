import java.util.Scanner;
public class carclass
{
	private String paint, interior, engine, tires;
	public carclass()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	public carclass(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	public String getPaint()
	{
		return paint;
	}
	public String getInterior()
	{
		return interior;
	}
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the paint color you want: ");
		String paint = kb.nextLine();
		System.out.println("Please enter the interior color you want: ");
		String interior = kb.next();
		System.out.println("Please enter the type of engine you want: ");
		String engine = kb.next();
		System.out.println("Please enter the kind of tires you want: ");
		String tires = kb.next();
		
		carclass object = new carclass(paint, interior, engine, tires);
		System.out.print("Your vehicle is ready..... \n Paint: " + object.getPaint() + "\n Interior: " + object.getInterior() + "\n Engine: " + object.getEngine() + "\nTires: "+ object.getTires());
		
	}

	
}