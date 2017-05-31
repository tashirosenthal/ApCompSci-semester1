public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String getResponse(String statement)
	{
		String response = "";
<<<<<<< HEAD
		if(findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0
				|| findKeyword(statement, "sister", 0) >= 0
				|| findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.length() == 0)
		{
			response = "Please say something";
		}
		else if(findKeyword(statement, "cat", 0) >= 0
			|| findKeyword(statement, "dog", 0) >= 0
			|| findKeyword(statement, "fish", 0) >= 0
			|| findKeyword(statement, "turtle", 0) >= 0)
=======
		if(statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		if(statement.length() == 0)
		{
			response = "Please say something";
		}
		else if(statement.indexOf("cat") >= 0
			|| statement.indexOf("dog") >= 0
			|| statement.indexOf("fish") >= 0
			|| statement.indexOf("turtle") >= 0)
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
			{
				response = "Tell me more  about your pet.";
			}
		else if(statement.indexOf("Robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher";
		}
		
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if(findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		else if(findKeyword(statement, "I want", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		else if(statement.equals("bye"))
		{
			System.out.println("Okay then Bye:(");
			System.exit(0);
		}
<<<<<<< HEAD
		 
		else
		{
			
=======
		else
		{
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
			int psn = findKeyword(statement, "you", 0);
			
			if (psn >= 0 && findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else
<<<<<<< HEAD
			{
				psn =findKeyword(statement, "i" , 0);

					if(psn >= 0 && findKeyword(statement, "you", psn) >= 0)
					{
						response = transformIYouStatement(statement);
					}
			
				else
				{	
					response = getRandomResponse();
				}
			}
			
=======
			{	
				response = getRandomResponse();
			}
>>>>>>> 5ab3144475643b32b8d76012fd700eaf98c587cf
		}
		return response;
	}
	private String transformIWantToStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		if(lastChar.equals("."))
		{
			phrase = phrase.substring(0, phrase.length() - 1);
		}
		int psnOfI = findKeyword (phrase, "I", 0);
		int psnOfYou = findKeyword (phrase, "you", psnOfI);
		
		String restOfStatement = phrase.substring(psnOfYou + 3);
		return "What would it mean to " + restOfStatement;
	}
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		String lastChar = statement.substring(statement.length() - 1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfYou = findKeyword(statement, "you", 0);
		int psnOfMe = findKeyword(statement, "Me", psnOfYou + 3);
		String restOfStatement =  statement.substring(psnOfYou + 3, psnOfMe);
		return "What makes you think that I" + restOfStatement + " you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim().toLowerCase();
		String lastChar = statement.substring(statement.length() -1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		int psnOfI = findKeyword(statement, "i", 0);
		int psnOfYou = findKeyword(statement, "you", psnOfI + 3);
		String restOfStatement =  statement.substring(psnOfI + 2, statement.indexOf("you"));
		return "Why do you " + restOfStatement + " me?";
	}
	
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}
		return -1;
	}

	
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
