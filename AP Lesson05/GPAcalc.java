import java.util.Scanner;
public class GPAcalc
{
	public static void main(String[]args)
	{
	
	    Scanner kb = new Scanner(System.in);
		GPAcalc gpoints = new GPAcalc();
		System.out.println("Please enter your history grade: ");
		String history = kb.nextLine();
		System.out.println("Please enter your math grade: ");
		String math = kb.nextLine();
		System.out.println("Please enter your science grade: ");
		String science = kb.nextLine();
		System.out.println("Please enter your english grade: ");
		String english = kb.nextLine();
		System.out.println("Please enter your spanish grade: ");
		String spanish = kb.nextLine();
		System.out.println("Please enter your art grade: ");
		String art = kb.nextLine();
		System.out.println("Please enter your PE grade: ");
		String PE = kb.nextLine();
	
		double gPoints = calcPoints(history) + calcPoints(math) + calcPoints(science) + calcPoints(english) + calcPoints(spanish) + calcPoints(art) +calcPoints(PE);
		System.out.printf("Your GPA is: %.2f" ,gPoints/7);
	}
	public static double calcPoints(String grade)
	{
		double gPoints = 0; 
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return gPoints;
		
	}
}