package pack1;

public class Test {
	public static void main(String[] args) throws Exception  //Is returning a higher number after eliminating for guesses.....
	{
		int[] arr = new int[4];
		arr[0] = 4;
		arr[2] = 6;
		System.out.println(arr[1]);
		Entry[] dictionary1 = Dictionary.assembleDictionary();
		System.out.println(Dictionary.getNumLeft());
		Eliminator elim = new Eliminator(dictionary1,"eagle");
		dictionary1 = elim.elimByLength();
		System.out.println(Dictionary.getNumLeft());
		elim.changeDic(dictionary1);
		//char test = (elim.elimByGuess(char)[i].getCommonLetter(string));
		dictionary1 = elim.elimByGuess('g');
		System.out.println(Dictionary.getNumLeft());
	}
}
