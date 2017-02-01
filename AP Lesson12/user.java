public class username
{
	private String firstname;
	private String lastname;
	private String avatar;
	private int userID;
	
	public static void main(String[]args)
	{
		System.out.println("Please enter first name: ");
		String firstname = kb.nextline();
		System.out.println("Please enter your last name: ");
		String lastname = kb.next();
		System.out.println("Do you want a public avatar? ");
		String avatar = kb.next();
		if(avatar = "yes")
		{
			System.out.println("Please enter your avatar: ");
		}
	}
	public username()
	{
		//default instance varaibles 
		username = "";
		firstname = "";
		lastname = "";
	}
	// regular constructor w parameters
	public username(String uname, String fname, String lname)
	{
		username = uname;
		firstname = fname;
		lastname = lname;
	}
	//modifers
	public void setUsername(String uname)
	{
		username = uname;
	}
	//acessor
	public String getUsername()
	{
		return username;
	}
	public String getfirstname()
	{
		return firstname;
	}
	public String getlastname()
	{
		return lastname;
	}


	
}