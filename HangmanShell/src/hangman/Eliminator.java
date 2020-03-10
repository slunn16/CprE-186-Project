package hangman;
/*
 * This class handles the elimination of word from the dictionary list according to the guesses and other specifications
 */
public class Eliminator 
{
	private Entry[] tempDic;
	private String answer;
	
	public Eliminator(Entry[] tempList, String answerX)
	{
		tempDic = tempList;
		answer = answerX;
	}
	/*
	 * Eliminates words based on if their length matches that of the answer
	 * 
	 * @param answer The correct answer
	 * 
	 * @return the newly updated dictionary
	 */
	public Entry[] elimByLength()
	{
		for(int i = 0; i<Dictionary.getNumEntries();i++)
		{
			if(answer.length()!=tempDic[i].getWord().length()||tempDic[i].getStatus()==false)
			{
				tempDic[i].changeStatus();
			}
		}
		return tempDic;
	}
	/*
	 * Eliminates words based a character guessed by the computer
	 * 
	 * @param guess the guessed character
	 * 
	 * @return  the new updated dictionary
	 */
	public Entry[] elimByGuess(char guess)
	{
		int[] guessIndex = new int[answer.length()];
		String temp = answer;
		int x = 0;
		int place = 0;
		for(int k=0;k<temp.length();k++)
		{
			guessIndex[x] = temp.indexOf(guess,place);
			place = guessIndex[x]+1;
		}
		int spot = 0;
		int index2 = 0;
		for(int i = 0; i<Dictionary.getNumEntries();i++)
		{
			index2=0;
			spot=0;
			while(guessIndex[index2]!=0&&index2!=0)
			{
				if(tempDic[i].getWord().indexOf(guess,spot)!=guessIndex[index2])
				{
					tempDic[i].changeStatus();
				}
				else
				{
					spot = guessIndex[index2]+1;
					index2++;
				}
			}
			
		}
		return tempDic;
	}
	

}
