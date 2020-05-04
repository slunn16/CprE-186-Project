package pack1;

public class Tester {
	public static void main(String [] args) {
		System.out.print(getCommonLetter("hellooo"));
	}
	public static char getCommonLetter(String s) {
		int length = s.length();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char[] letters = alpha.toCharArray();
		int[] count = new int[alpha.length()];
		int max = count[0];
		int index = 0;
		for (int i = 0; i < length; i++) {
			for (int l = 0; l < letters.length; l++) {
				if (s.charAt(i) == letters[l]) {
					count[l] = count[l]+ 1;
				}
			}
		}
		for (int j = 0; j < count.length; j++) {
			if (count[j] > max) {
				max = count[j];
				index = j;
			}
		}
		return letters[index];
	}
}
