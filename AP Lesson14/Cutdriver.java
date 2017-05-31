import java.util.Arraylist;
public class Cutdriver
{
	public static void main(String[]args)
	{
		ArrayList<Cutshapes> cuts = new ArrayList<>();
		cuts.add(new rectangle(10, 12));
		cuts.add(new Circle(5));
		
		for(Cutshapes sh :cuts)
		System.out.println(sh.geArea());
	}
}