import java.util.Arrays;

public class ShortestWord {
   public static int findShort(String s) {
		String[] temp = s.split("\\s+");
		Arrays.sort(temp, (a, b)->Integer.compare(a.length(), b.length()));
		return temp[0].length();		
	}
}