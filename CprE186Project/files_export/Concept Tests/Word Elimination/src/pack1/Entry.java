package pack1;

public class Entry 
{
	private boolean isPossible;
	private String word;
	
	public Entry(String x)
	{
		word = x;
		isPossible = true;
	}
	
	public boolean getStatus()
	{
		return isPossible;
	}
	
	public String getWord()
	{
		return word;
	}
	
	public void changeStatus()
	{
		if(isPossible)
		{
			isPossible = false;
		}
		else
		{
			isPossible = true;
		}
		
	}
	//Replaces the character at index y with char x
	public void fillSpace(char x, int y)
	{
		word = word.substring(0,y) + x + word.substring(y+1);
	}

}
