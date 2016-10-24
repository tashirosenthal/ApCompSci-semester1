public class albumsales
{
	public static void main(String[]args)
	{
		String name = "James Bond";
		int units = 1500000;
		String category = "";
		
		if(units>= 1000000)
			category = "top seller"; 
		else if(units>= 500000)
			category = "good seller";
		else if(units>= 100000)
			category = "average";
		else
			category = "needs review";
		System.out.println(name + " = " + category);
	}
}