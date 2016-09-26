public class Retmethods
{public static void main(String[]args)
	{
		Retmethods average = new Retmethods();
		int n1 = 4;
		int n2 = 2;
		int n3 = 12;
		double avg = average.calcAvg(n1, n2,n3);
		System.out.println("The volume of your cube is" + avg);
		
		
		
		
		
	}
      public double calcAvg(int one, int two, int three)
	{
      return (one+two+three)/3.0;
	}
}