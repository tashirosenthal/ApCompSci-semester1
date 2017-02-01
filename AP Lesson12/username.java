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


	
}