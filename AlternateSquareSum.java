public class AlternateSquareSum {

	public static int alternateSqSum(int[] arr) {
		int counter = 1;
		int total = 0;
		for (int i : arr) {
			if (counter % 2 == 0) {				
				total += (i * i);
			} else {
				total += i;
			}
			counter++;
		}
		return total;
	}
} 