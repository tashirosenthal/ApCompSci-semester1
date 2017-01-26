import java.util.Scanner;
public class mphrun
{
	public static void main(String[]args)
{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter the distance travelled: ");
	int distance = kb.nextInt();
	System.out.println("Please enter the hours travelled: ");
	int hours = kb.nextInt();
	System.out.println("Please enter the minutes travelled : ");
	int minutes = kb.nextInt();
	mph object = new mph(distance, hours , minutes);
	System.out.println(object.getdistance() + "miles in " + object.getHours() + " and" + object.getminutes() + " mins = " + object.getmph());
	
}
}