import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class StockList { 
	private static final int ALPHABET_LENGTH = 26;

	public static String stockSummary(final String[] listOfArt, final String[] listOfLetters) {
		if (listOfArt.length == 0 || listOfLetters.length == 0) {
			return "";
		}

		final boolean[] shouldCollect = new boolean[ALPHABET_LENGTH];
		final int[] counts = new int[ALPHABET_LENGTH];

		int lastIndex = -1;

		for (String letter : listOfLetters) {
			final int index = letter.charAt(0) - 65;
			shouldCollect[index] = true;
			if (index > lastIndex) {
				lastIndex = index;
			}
		}

		for (String art : listOfArt) {
			final int index = art.charAt(0) - 65;
			counts[index] += Integer.parseInt(art.split(" ")[1]);
		}

		return Arrays.stream(listOfLetters).map(letter -> "(" + letter + " : " + counts[letter.charAt(0) - 65] + ")").collect(Collectors.joining(" - "));
	}

}