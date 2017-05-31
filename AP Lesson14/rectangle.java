public class rectangle implements cutshapes
{
	private double sideA, sideB;
	public rectangle()
	{
		sideA = sideB = 0;
	}
	public rectangle(double a, double b)
	{
		sideA = a;
		sideB = b;
	}
	public double getSideA()
	{
		return sideA;
	}
	public double getSideB()
	{
		return sideB;
	}
	public double getArea()
	{
		return sideA * sideB;
	}
}