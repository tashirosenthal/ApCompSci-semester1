import java.util.Scanner;
public class humanclass
{
	private String hair, eyes, skin;
	public humanclass()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public humanclass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public void setCustom(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the hair color you want: ");
		String hair = kb.nextLine();
		System.out.println("Please enter the eye color you want: ");
		String eye = kb.next();
		System.out.println("Please enter the type of skin you want: ");
		String skin = kb.next();
		
		humanclass object = new humanclass("blonde" , "blue", "pale");
		System.out.print("I look like \n Hair " + object.getHair() + "\n Eyes: " + object.getEyes() + "\n Skin: " + object.getSkin());
		
		humanclass object1 = new humanclass(hair, eye, skin);
		System.out.println("\n My friend looks like.. \n Hair " + object1.getHair() + "\n Eyes: " + object1.getEyes() + "\n Skin: " + object1.getSkin());
	}

	
}