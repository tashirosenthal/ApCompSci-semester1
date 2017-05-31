import java.util.Scanner;
public class gamegun
{
	static int bulletcount = 0;
	static int clipsize = 16;
	static int shotcount = 0;
	static String []clip = new String[clipsize];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletcount = 96;
		shotcount = 0; 
		String []clip = new String [clipsize];
		resetclip();
		while(bulletcount > 0 || shotcount > 0)
		{
			System.out.println("Action: ");
			String action = kb.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printclip();
		}
		System.out.println("Out of bullets");
	}
	static void resetclip()
	{
		for(int i = 0; i < clipsize; i++)
		{
			clip[i] = "[]";
		}
	}
	static String shoot()
	{
		if(shotcount > 0)
		{
			clip[shotcount - 1] = "[]";
			shotcount--;
			return "Boom!!";
		}
		else
		{
			return "Reload!!!!!";
		}
	}
	static void reload()
	{
		if(bulletcount >= clipsize)
		{
			bulletcount -= clipsize;
			shotcount = clipsize;
		}
		else
		{
			shotcount = bulletcount;
			bulletcount = 0;
		}
		resetclip();
		for(int i = 0; i < shotcount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	static void printclip()
	{
		String fDT = "";
		System.out.print("Bullets: " + "\t" + bulletcount + "\n" + "clip" + "\t");
		String output = "";
		for(int i = 0; i < clipsize; i++)
		{
			output += clip[i] ;
		}
		System.out.println(output);
	}
}