import java.util.Random;
public class xoxo
{
	public static void main(String[]args)
	{
		String [][]XandO = new String [4][4];
		for(int i = 0; i < XandO.length; i++)
		{
			for(int j = 0; j < XandO[i].length; j++)
			{
		   		int pick = 1 + (int)(Math.random()*2);
				if(pick == 1)
				{
					XandO[i][j] = "x";
				}
				else
				{
					XandO[i][j] = "o";
				}
				System.out.print(XandO[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
}
