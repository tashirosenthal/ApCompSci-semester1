import java.util.Scanner;
import java.lang.Math.*;
public class mph
{
	private int distance, hours, minutes;
	private double miph;

	public mph()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
	}
	public mph(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
	}
	public int getdistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getminutes()
	{
		return minutes;
	}
	public double getmph()
	{
		miph = Math.round(distance / (hours + (minutes / 60.0)));
		return miph;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance travelled: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours travelled: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes travelled : ");
		int minutes = kb.nextInt();
		
		mph object = new mph(distance, hours , minutes);
		System.out.println(object.getdistance() + "miles in " + object.getHours() + " and" + object.getminutes() + " mins = " + object.getmph());
		
	}
}