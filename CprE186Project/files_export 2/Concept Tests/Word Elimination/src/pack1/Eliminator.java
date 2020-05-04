package pack1;
import java.io.File;
import java.util.Scanner;
//Our Final Program will have eliminator as a method of a hangman class and not it's own class
public class Eliminator 
{
	public static void main(String[] args) throws Exception
	{
		
		//Getting the list ready
		File dictionary = new File("U:\\CprE186\\WordList.txt");
		Scanner scan = new Scanner(dictionary);
		Entry[] list = new Entry[77722];
		int index = 0;
		while(scan.hasNextLine())
		{
			list[index] = new Entry(scan.nextLine());
			index++;
		}
		scan.close();
		
		
		//Elimination Testing
		String result = "monkey";
		int numLeft = 77722;
		int index2 = 0;
		while(index2<77722)
		{
			if(list[index2].getStatus())
			{
			if(list[index2].getWord().length()!=result.length())
			{
				list[index2].changeStatus();
				numLeft--;
			}
			}
			index2++;
		}
		System.out.println(numLeft);
		Entry game = new Entry("******");
		char guess = 'e';
		game.fillSpace(guess, result.indexOf(guess));
		System.out.println(game.getWord());
		index2 = 0;
		while(index2<77722)
		{
			if(list[index2].getStatus())
			{
				if(list[index2].getWord().charAt(game.getWord().indexOf('e')) != 'e')
				{
					list[index2].changeStatus();
					numLeft--;
				}
			}
			index2++;
		}
		System.out.println(numLeft);
		
		
		
		
	}
}
