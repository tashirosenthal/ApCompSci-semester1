public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem b = new Xbox("Xbox");
		GameSystem p = new PlayStation("Playstation");
		GameSystem d = new PC("PC");
		System.out.println(b);
		System.out.println(p);
		System.out.println(d);
	}
}