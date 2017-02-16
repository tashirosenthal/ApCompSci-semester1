public class Toystorerunner
{
	public static void main(String[]args)
	{
		toystore store = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store);
		System.out.println("\nThe most frequent toy " + store.getMostFrequentToy());
		System.out.println("Most frequent type of toy " +store.getMostFrequentType());
		
	}
}