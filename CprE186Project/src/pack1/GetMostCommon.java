package pack1;

public class GetMostCommon {
	static final int ASCII_SIZE = 256;

	static char getMaxOccuringChar(String str) {
		int count[] = new int[ASCII_SIZE];
		int length = str.length();
		for (int i = 0; i < length; i++)
			count[str.charAt(i)]++;
		int max = -1;
		char result = ' ';
		for (int i = 0; i < length; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "shayla";
		System.out.println(getMaxOccuringChar(str));
	}
}
