public class lesson04
{
	public static void main(String[]args)
	{
		lesson04 form = new lesson04();
		String word1 = "wassup";
		double number1 = 4666.900;
		form.format(word1, number1);
		
		String word2 = "Yesss";
		double number2 = 4666.900;
		form.format(word2, number2);
	
	}
	 public void format(String word, double number)
	 {
		 System.out.printf("\n%10s  %10.2f", word, number);
		 
		 
	 }
	
	
	
	
	
}