package pack1;
import java.io.File;
import java.util.Scanner;
public class DicTest 
{
	public static void main(String[] args) throws Exception
	{
		File dictionary = new File("C:\\Users\\tnd\\Downloads\\WordList.txt");
		Scanner scan = new Scanner(dictionary);
		Entry[] list = new Entry[77722];
		int index = 0;
		while(scan.hasNextLine())
		{
			list[index] = new Entry(scan.nextLine());
			index++;
		}
		System.out.println(list[52230].getWord());
		scan.close();
	}
}
