import java.util.Scanner;
public class distancerun
{
	public static void main(String[]args)
{
	Scanner kb = new Scanner(System.in);
		System.out.println("Please enter X1: ");
		int xone = kb.nextInt();
		System.out.println("Please enter Y1: ");
		int yone = kb.nextInt();
		System.out.println("Please enter X2: ");
		int xtwo = kb.nextInt();
		System.out.println("Please enter Y2 : ");
		int ytwo = kb.nextInt();
		distance object = new distance(xone, yone, xtwo , ytwo);
		System.out.println("The distance between : " + object.getXone() + object.getYone() + object.getXtwo() + object.getYtwo() + " is :" + object.getDist());
}
}