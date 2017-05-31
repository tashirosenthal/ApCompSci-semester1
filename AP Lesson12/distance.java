import java.util.Scanner;
import java.lang.Math.*;
public class distance
{
	private int xone, yone, xtwo, ytwo;
	private double dis;
	public distance()
	{
		xone = 0;
		yone = 0;
		xtwo = 0;
		ytwo = 0;
	}
	public distance(int x1, int y1, int x2, int y2)
	{
		xone = x1;
		yone = y1;
		xtwo = x2;
		ytwo = y2;
	}
	public void setValues(int x1, int y1, int x2, int y2)
	{
		xone = x1;
		yone = y1;
		xtwo = x2;
		ytwo = y2;
	}
	public int getXone()
	{
		return xone;
	}
	public int getYone()
	{
		return yone;
	}
	public int getXtwo()
	{
		return xtwo;
	}
	public int getYtwo()
	{
		return ytwo;
	}
	public double getDist()
	{
		dis = Math.sqrt((xtwo-xone)*(xtwo-xone)+(ytwo-yone)*(ytwo-yone));
		return dis;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter X1: ");
		int xone = kb.nextInt();
		System.out.println("Please enter Y1: ");
		int yone = kb.nextInt();
		System.out.println("Please enter X2: ");
		int xtwo = kb.nextInt();
		System.out.println("Please enter Y2 : ");
		int ytwo = kb.nextInt();
		distance object = new distance(xone, yone, xtwo , ytwo);
		System.out.println("The distance between : " + object.getXone() + object.getYone() + object.getXtwo() + object.getYtwo() + " is :" + object.getDist());
	
	}
}

	
