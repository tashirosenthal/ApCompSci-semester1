import java.util.Scanner;
public class gamehealth
{
	static String[] health;
	static int healthload = 6;
	static int healthcount = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthcount = 6;
		health = new String[healthload];
		
		while(!turn.equals("Q") && healthcount > 0)
		{
			System.out.println("Your turn hit enter when ready: ");
			turn = kb.nextLine();
			damage = 1 + (int)(Math.random() * 2);
			amount = 1 + (int)(Math.random() * 6);
			System.out.print(takeDamage(damage, amount));
			System.out.println(printclip());
		}
		System.out.println("You died!!");
	}
	static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthcount -= amount;
		}
		else
		{
			if(healthcount + amount < healthload)
			{
				amount += healthcount;
			}
			else
			{
				healthcount = healthload;
			}
		}
		return "power up" + amount + "!";
	}
	static String printclip()
	{
		String output = "health" + "\t";
		for(int i = 0; i < healthload; i++)
		{
			if(i < healthcount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		return output;
	}
}