package hangman;
/*
 *  Creates object used to track dictionary entries for individual words
 */
public class Entry 
{
	private String word;
	private boolean status;
	
	/*
	 * Constructor to initialize the object
	 * 
	 * @param x String input to assign word to
	 */
	public Entry(String x)
	{
		word = x;
		status = true;
	}
	/*
	 * Changes the boolean representing viability of the word
	 */
	public void changeStatus()
	{
		if(status == true)
		{
			status = false;
		}
		else
		{
			status = true;
		}
	}
	/*
	 * Returns the word string
	 * 
	 * @return the string representing the word in the dictionary
	 */
	public String getWord()
	{
		return word;
	}
	/*
	 * Returns the status boolean
	 * 
	 * @return the boolean representing whether the word is a possible answer
	 */
	public boolean getStatus()
	{
		return status;
	}
}
