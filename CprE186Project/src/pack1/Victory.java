package pack1;

public class Victory {
	public static void main(String[] args)
	{
		String word = "Example";
		int charsLeft = word.length();
		int found = 0;
		int turnCount = 0;
		int lives = 6;
		while(charsLeft>0||lives>0)
		{
			//GUESSING

			//FILL IN GUESSED CHARS
			found = 1;  //HOWEVER MANY CHARACTERS ARE FILLED
			//SUBTRACT FROM CHARS LEFT
			charsLeft -= found;
			//SUBTRACT LIVES IF NECESSARY
			if(found == 0)
			{
				lives--;
			}
			//INCREMENT TURN COUNT
			turnCount++;
		}
		if(lives==0)
		{
			System.out.println("You lose");
		}
		else if(lives > 4)
		{
			System.out.println("Gold");
		}
		else if(lives > 2)
		{
			System.out.println("Silver");
		}
		else
		{
			System.out.println("Bronze");
		}
		System.out.println("Turns: "+turnCount);
	}
}
