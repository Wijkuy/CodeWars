class Persist {
static int counter = 1;

public static int persistence(long n) {
		int total = 1;
		if (Long.toString(n).toCharArray().length > 1) {
			for (char c : Long.toString(n).toCharArray()) {
				total = total *= Integer.parseInt(c + "");
			}
			if (total < 10) {
				int end = counter;
				counter = 1;
				return end;
			}
			counter++;
			return persistence(total);
		}
		return 0;
	}
}