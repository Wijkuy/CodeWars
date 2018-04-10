import java.util.Arrays;

public class Temp{

	static String[] temp = { "racecar","dog", "cat", "bear", "dogcat", "elephant", "bearcat" };

	public static String longest() {
		Arrays.asList(temp).stream().sorted((a, b) -> a.length() < b.length() ? 1 : -1).forEach(System.out::println);
		String output = "";
		for (String s : temp) {
			for (String x : temp) {
				if (!s.equals(x) && s.contains(x) && s.length() > output.length()) {
					output = s;
					System.out.println("current largest is: " + output + ",Length is: " + s.length());
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println(longest());
	}

}
