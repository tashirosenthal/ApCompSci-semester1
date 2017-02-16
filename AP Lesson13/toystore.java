import java.util.ArrayList;
import java.util.Arrays;
public class toystore
{
	ArrayList<Toy>toyList = new ArrayList<Toy>();
	public toystore()
	 {
		toyList = new ArrayList<>();
	 }
	 
	 public toystore(String ts)
	 {
		loadToys(ts);
	 }
	 
	 public void loadToys(String ts)
	 {
		ArrayList<String>Toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		toyList = new ArrayList<>();
		
		for(int i = 0;i < Toys.size(); i+= 2)
		{
			String name = Toys.get(i);
			String type = Toys.get(i + 1);
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toyList.add(new car (name));
				if(type.equalsIgnoreCase("AF"))
					toyList.add(new afigure(name));
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
		}
	  }	
		public Toy getThatToy(String nm)
		{
			for(Toy t : toyList)
			{
				if(t.getName().equalsIgnoreCase(nm))
				{
					return t;
				}
			}
			return null;
		}
		public String getMostFrequentToy()
		{
			String name = "";
			int max = Integer.MIN_VALUE;
			for(Toy t: toyList)
			{
				if(max < t.getCount())
				{
					max = t.getCount();
					name = t.getName();
				}
			}
			return name;
		}
		public String getMostFrequentType()
		{
			int cars = 0;
			int figures = 0;
			for(Toy t : toyList)
			{
				if(t.getType().equalsIgnoreCase("car"))
				{
					cars ++;
				}
				if(t.getType().equalsIgnoreCase("afigure"))
				{
					figures ++;
				}
			}
			if(cars > figures)
			{
				return "cars";
			}
			if(figures > cars)
			{
				return "action figures";
			}
			else
			{
				return "equal numbers of cars and action figures!";
			}
		}
		public String toString()
		{
			return toyList.toString();
		}
		
}