package pack1;
import java.io.File;
import java.util.Scanner;
public class DicTest 
{
	public static void main(String[] args) throws Exception
	{
		File dictionary = new File("/Users/shaylalunn/Desktop/WordList.txt");
		Scanner scan = new Scanner(dictionary);
		Entry[] list = new Entry[77722];
		int index = 0;
		while(scan.hasNextLine())
		{
			list[index] = new Entry(scan.nextLine());
			list[index].setCommonLetter();
			list[index].getCommonLetter();
			index++;
		}
		System.out.println(list[9].getWord());
		scan.close();
		//entry.getCommonLetter();
		list[9].setCommonLetter();
		System.out.println(list[9].getCommonLetter());
	}
}