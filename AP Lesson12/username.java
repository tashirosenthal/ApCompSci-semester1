public class username
{
	private String username, firstname, lastname;
	
	//default constructor
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
	public static void main(String[]args)
	{
		username object = new username("tash", "hola", "nice");
		System.out.println("<<<<<<<<USER INFO>>>>>>>>");
		System.out.println("Name: " + object.getfirstname() + object.getlastname());
		System.out.println("User name: "+ object.getUsername());
		
		username object1 = new username();
		System.out.println("<<<<<<<<USER INFO>>>>>>>>");
		System.out.println("Name: " + object1.getfirstname() + object1.getlastname());
		System.out.println("User name: "+ object1.getUsername());
		
		username object2 = new username();
		System.out.println("<<<<<<<<USER INFO>>>>>>>>");
		System.out.println("Name: " + object2.getfirstname() + object2.getlastname());
		System.out.println("User name: "+ object2.getUsername());
	}

	
}