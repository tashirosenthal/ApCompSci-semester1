public class diceroll
{
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*8)+1;
		int computer = (int)(Math.random()*8)+1;
		
	
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		diceRoll(player, computer);
		
	}
	public static void diceRoll(int player, int computer)
	{
		if (player > computer)
		  System.out.println("Your are the winner!");
	    if ( player < computer)
		  System.out.println("The computer is the winner!");
	}
	
	
	
}