import java.util.ArrayList;
import java.util.Arrays;
public class exprsolver

{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String ex = kb.nextLine();
		
		Arraylist<String>equation = new ArrayList<>(Arrays.asList(espression.split("")));
		doEquation(equation, ex);
		
	}
	public static Arraylist doEquation(Arraylist<String>equation)
	{	
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.set(i-1)) * (Integer.parseInt(equation.set(i+1)))));
				}
				else
				{
					equation.set(i, "" + (Integer.parseInt(equation.set(i-1)) / (Integer.parseInt(equation.set(i+1)))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
				i++;
			}
		}
	}
}

