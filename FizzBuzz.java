
public class FizzBuzz {

	public static void main(String[] args) {
		String s = "";
		for (int i = 0; i < 100; i++) {
			s = (i % 3 == 0) ? (i % 5 == 0) ? "FIZZBUZZ" : "FIZZ" : (i % 5 == 0) ? "Buzz" : i + "";
			System.out.println(s);
		}
	}
}