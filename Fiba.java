

public class Fiba {
	public static void generate() {
		long previous = 0;
		long total = 0;
		for (int i = 0; i < 50; i++) {
			previous = (i == 2) ? 0 : previous;
			total = (i < 2) ? i : (i == 2) ? 1 : total + previous;
			previous = total - previous;
			System.out.print(total + " ");
		}
	}
}
