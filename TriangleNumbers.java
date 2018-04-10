public class TriangleNumbers {

	@SuppressWarnings("boxing")
	public static Boolean isTriangleNumber(long number) {
		int total = 0;

		for (int i = 0; total < number; i++) {
			total = total + i;
		}

		return total == number;

	}

}