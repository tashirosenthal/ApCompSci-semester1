public class lesson11s
{
	public static void main(String[]args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String [][] randletters = new String [4][4];
		int spot = 0;
		for(int i = 0; i < randletters.length; i ++)
		{
			for(int j = 0; j < randletters[i].length; j++)
			{
				randletters[i][j] = letters.substring(spot, spot +1);
				spot++;
			}		
		}
		for(int i = 0; i <randletters.length; i++)
		{
			for(int j = 0; j < randletters[i].length; j++)
			{
				System.out.println(randletters[i][j] + "\t");
			}
		}
			System.out.println();
	}
}
