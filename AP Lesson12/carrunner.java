import java.util.Scanner;
public class carrunner
{
public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the paint color you want: ");
		String paint = kb.nextLine();
		System.out.println("Please enter the interior color you want: ");
		String interior = kb.next();
		System.out.println("Please enter the type of engine you want: ");
		String engine = kb.next();
		System.out.println("Please enter the kind of tires you want: ");
		String tires = kb.next();
		
		carclass object = new carclass(paint, interior, engine, tires);
		System.out.print("Your vehicle is ready..... \n Paint: " + object.getPaint() + "\n Interior: " + object.getInterior() + "\n Engine: " + object.getEngine() + "\nTires: "+ object.getTires());
		
	}
}	