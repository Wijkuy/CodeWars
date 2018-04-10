import java.util.ArrayList;
import java.util.List;

public class CompoundArray {
    
  @SuppressWarnings("boxing")
	public static int[] compoundArray(int[] a, int[] b) {
List<Integer> temp = new ArrayList<>();

		int counter = 0;
		while (counter < Math.max(a.length, b.length)) {
			if (a.length > counter) {
				temp.add(a[counter]);
			}

			if (b.length > counter) {
				temp.add(b[counter]);
			}
			counter++;

		}

		int[] output = temp.stream().mapToInt(i -> i).toArray();

		return output;
    }
}