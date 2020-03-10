package hangman;
public class Test 
{
	public static void main(String[] args) throws Exception  //Is returning a higher number after eliminating for guesses.....
	{
		Entry[] dictionary1 = Dictionary.assembleDictionary();
		System.out.println(Dictionary.getNumLeft());
		Eliminator elim = new Eliminator(dictionary1,"eagle");
		dictionary1 = elim.elimByLength();
		System.out.println(Dictionary.getNumLeft());
		elim.changeDic(dictionary1);
		dictionary1 = elim.elimByGuess('g');
		System.out.println(Dictionary.getNumLeft());
	}
}
