public class SmallestIntegerFinder {
   public static int findSmallestInt(int[] args) {
		int smallest = (args.length > 0) ? args[0] : 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println(smallest);

			if (args[i] < smallest) {
				smallest = args[i];
			}
		}
		return smallest;
	}
}