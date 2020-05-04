package hangman;

import java.io.File;
import java.util.Scanner;
/*
 *  Class to create the dictionary (no object created, static methods)
 */
public class Dictionary 
{
	private static final int NUM_ENTRIES = 194433;
	private static Entry[] list;
	private static int extraWords = 0;
	private static int wordsLeft;
	private Dictionary()
	{
		
	}
	/*
	 * Creates the dictionary as an array of Entry objects
	 * 
	 * @return the array of Entry objects that forms the dictionary
	 */
	public static Entry[] assembleDictionary() throws Exception
	{
		list = new Entry[NUM_ENTRIES+501];
		File dictionary = new File("C:\\Users\\tnd\\Downloads\\WordList v2.txt");
		Scanner scan = new Scanner(dictionary);
		int index = 0;
		while(scan.hasNextLine())
		{
			list[index] = new Entry(scan.nextLine());
			index++;
		}
		scan.close();
		return list;
	}
	/*
	 * Gives the number of entries in the dictionary including custom words
	 * 
	 * @return the number of entries
	 */
	public static int getNumEntries()
	{
		return NUM_ENTRIES + extraWords;
	}
	
	/*
	 * Returns the list array outside of the assemble method
	 * 
	 * @return the dictionary without modifying it
	 */
	public static Entry[] getDic()
	{
		return list;
	}
	/*
	 * Adds up to 500 extra custom words to the dictionary
	 * 
	 * @param addition String of what word to add
	 */
	public static void addWord(String addition)  //CURRENTLY DOES NOT WORK DUE TO STATIC NATURE OF CLASS
	{
		if(extraWords<501)
		{
			list[NUM_ENTRIES+extraWords] = new Entry(addition);
			extraWords++;
		}
		else
		{
			System.out.println("There is no more space for extra words");
		}
	}
	/*
	 * Checks how many words are left and returns it
	 * 
	 * @return number of remaining words
	 */
	public static int getNumLeft()
	{
		wordsLeft = 0;
		for(int i = 0;i<NUM_ENTRIES+extraWords;i++)
		{
			if(list[i].getStatus()==true)
			{
				wordsLeft++;
			}
		}
		return wordsLeft;
	}
	
	/*
	 *  Checks if given word is in the dictionary
	 *  
	 *  @param entryTest 
	 */
	public boolean inDic(String entryTest)
	{
		for(int i = 0; i< NUM_ENTRIES;i++)
		{
			if(list[i].getWord().equalsIgnoreCase(entryTest))
			{
				return true;
			}
		}
		return false;
	}

}
