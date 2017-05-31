import java.util.Scanner;
public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
		        "\n 1. Eat great food in Japan" +
				"\n 2. Or explore Japan?");
							  
		int a = kb.nextInt();
		if(a == 1)
		{
			System.out.println("What food would you like to eat?" +
			    "\n 1. Sushi"+
				"\n 2. Ramen");
				int b = kb.nextInt();
				if(b == 1)
				{
				     System.out.println("Great choice what kind of sushi do you want" +
					             "\n 1.Salmon?" +
								 "\n 2. Toro?");
								 int c = kb.nextInt();
								 if(c == 1)
								 {
									 System.out.println("Great Choice enjoy your meal!");
								 }
								 else
								 {
									 System.out.println("Wow expensive but worth it enjoy!");
								 }
					 
				}
				else
				{
					System.out.println("Ooh Yum! Which kind of ramen would you like to order?" +
					                "\n 1.Tonkatsu?" +
					                "\n 2.Shoyu?");
					int e  = kb.nextInt();
					if(e == 1)
					{
				        System.out.println("Very nice add some hot sauce for extra flavor!");
					}
					else
					{
						System.out.println("Very traditional soy sauce is great!");
					}
				}
		}
		else
		{
			System.out.println("Awesome would you like to visit" +
							"\n 1. A temple?" +
							"\n 2. Take the train?");
							int r = kb.nextInt();
							if(r == 1)
							{
								System.out.println("Great choice! would you like to visit one in" +
								"\n 1.Tokyo" +
								"\n 2.Kyoto");
								int f = kb.nextInt();
								if(f == 1)
								{
									System.out.println("Good idea! Do you want to go to" +
									"\n 1.Tennoji temple" + 
									"\n 2.Meji Gingu");
									int y = kb.nextInt();
									if(y == 1)
									{
										System.out.println("How classic enjoy your visit!");
									}
									else
									{
										System.out.println("Stunning! Have a good time!");
									}
								}
							}
							else 
							{
								System.out.println("Would you like to" +
								"\n 1.Take the shinkansen bullet train to hakkone?" +
								"\n 2.Or take the subway to Roponggi?");
								int h = kb.nextInt();
								if(h == 1)
								{
									System.out.println("Sound relaxing! What would you like to do when you arrive?" +
														"\n 1. Take a dip in the mountain spring spa?" +
														"\n 2. Take a gondola over Mount Fuji?");
														int n = kb.nextInt(); 
														if(n ==1)
														{
															System.out.println("How refreshing have a nice stay!");
														}
														else
														{
															System.out.println("Very scenic! Watch out for the sulfur deposits!");
														}
											
								}
								else
								{
									System.out.println("Excitemnt is in your near future! Do you want to" +
														"\n 1.Eat at the famous restaurant from Kill Bill" +
														"\n 2.Explore the manga world");
														int v = kb.nextInt();
														if(v == 1)
														{
															System.out.println("Yum! Make sure to get reservations it gets busy!");
														}
														else
														{
															System.out.println("Look for your favorite anime character and buy some suvoniers!");
														}
								}
							}
		}
	}
}