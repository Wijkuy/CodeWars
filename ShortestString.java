import java.util.Arrays;

public class ShortestString {

	public ShortestString() {
		// TODO Auto-generated constructor stub
	}

	public static int findShort(String s) {
		String[] temp = s.split("\\s+");
		Arrays.sort(temp, (a, b) -> Integer.compare(a.length(), b.length()));
		return temp[0].length();

	}

	public static boolean isSquare(int n) {
		return (Math.sqrt(n) == (int) (Math.sqrt(n)));
	}

	public static String getMiddle(String word) {
		return (word.length() % 2 == 0) ? word.substring((word.length() / 2)-1, (word.length() / 2)+1) : word.substring((word.length() / 2) , (word.length() / 2)+1);
	}

	public static void main(String[] args) {
		System.out.println(getMiddle("apple"));
		System.out.println(getMiddle("aabddqqqqqqqbdfsdfsabbadfdsafbbbbbbb"));
		System.out.println(getMiddle("table"));

	}

}
