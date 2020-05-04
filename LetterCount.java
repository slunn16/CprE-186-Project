package pack1;

public class LetterCount {
	private char letter;
	private int count;
	public LetterCount(int num) {
		count = num;
	}
	public void setLetter(char l) {
		letter = l;
	}
	public char getLetter() {
		return letter;
	}
	public void setCount(int c) {
		count = c;
	}
	public int getCount() {
		return count;
	}
	public String getLetterCount() {
		return letter + " : " + count;
	}
}
