public class lesson111
{
	public static void main(String[]args)
	{
		int [][]values = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0;i < values[i].length; j++)
			{
				values[j][i] = num;
				num++;
			}
	
		}
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j <values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
	}
}