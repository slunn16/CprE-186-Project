package pack1;

public class Entry {
	private boolean isPossible;
	private String word;
	private int length;
	private LetterCount [] numLetter;
	static final int ASCII_SIZE = 256;

	public Entry(String x) {
		word = x;
		isPossible = true;
	}

	public boolean getStatus() {
		return isPossible;
	}

	public String getWord() {
		return word;
	}

	public void changeStatus() {
		if (isPossible) {
			isPossible = false;
		} else {
			isPossible = true;
		}

	}

	public void setCommonLetter() {
		length = word.length();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		numLetter = new LetterCount[alpha.length()];
		//set letters in array
		for(int i = 0; i < alpha.length(); i++) {
			numLetter[i] = new LetterCount(length);
			numLetter[i].setLetter(alpha.charAt(i));
		}
		//set letter count
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < numLetter.length; j++) {
				if(word.charAt(i) == numLetter[j].getLetter()) {
					numLetter[j].setCount(numLetter[j].getCount() + 1);
				}
			}
		}
	}
	
	public String getCommonLetter() {
		int max = 0;
		int index = 0;
		for(int i = 0; i < length; i++) {
			if(numLetter[i].getCount() > max) {
				max = numLetter[i].getCount();
				index = i;
			}
		}
		return numLetter[index].getLetterCount();
	}

}
