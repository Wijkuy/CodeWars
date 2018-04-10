public class Chocolate{
  public static int breakChocolate(int n, int m) {
		if (n != 0 && m != 0) {
			return (n * (m - 1)) + (n - 1);
		}
		return 0;
	}
}