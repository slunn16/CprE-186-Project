package pack1;

public class Entry 
{
	private String word;
	private boolean isViable;
	
	public Entry(String x)
	{
		word =  x;
		isViable = true;
	}
	public void wrong()
	{
	   isViable = false; 
	}
	public String getWord()
	{
		return word;
	}
	public boolean getStatus()
	{
		return isViable;
	}
}
