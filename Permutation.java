import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Permutation {

	public Permutation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int length = 2;
		String[] arr = new String[length];
		String[] output = new String[arr.length];
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			long it = random.nextLong() & Long.MAX_VALUE;
			arr[i] = Long.toString(it);

		}
		output = checkDivisibility(arr);
		System.out.println(Arrays.toString(output));
	}

	static String[] checkDivisibility(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = "NO";
		}
		for (int i = 0; i < arr.length; i++) {
			String[] temp = build(arr[i]);
			for (int j = 0; j < temp.length; j++) {
				if (Long.parseLong(temp[j]) % 8 == 0) {
					output[i] = "YES";
				}
			}
		}
		return output;

	}

	static String[] build(String s) {
		List<String> temp = new ArrayList<>();
		if (s.length() == 1) {
			temp.add(s);
		} else {
			temp = combine(build(s.substring(0, s.length() - 1)), s.substring(s.length() - 1));
		}
		return temp.toArray(new String[temp.size()]);
	}

	public static List<String> combine(String[] arr, String c) {
		List<String> temp = new ArrayList<>();
		for (String s : arr) {
			for (int i = 0; i <= s.length(); i++) {
				temp.add(new StringBuffer(s).insert(i, c).toString());
			}
		}
		return temp;
	}

}
