import java.util.Arrays;
import java.util.Random;

public class MaxProfit {

	public MaxProfit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random random = new Random();
		int costPerCut = 10;
		int salesPrice = 34;
		int lengths_size = 3;
		int[] lengths = new int[lengths_size];

		for (int i = 0; i < lengths_size; i++) {
			lengths[i] = random.nextInt(200);
		}
		int res = maxProfit(costPerCut, salesPrice, lengths);
	}

	static int maxProfit(int costPerCut, int salePrice, int[] lengths) {
		int counter = 0;
		for (int length : lengths) {
			counter = (length > counter) ? length : counter;
		}
		System.out.println(counter);
		int total = 0;
		for (int i = 1; i < counter; i++) {
			int lengthSum = 0;
			int cutSum = 0;
			int cutWaste = 0;
			for (int length : lengths) {
				cutSum += (length % i == 0) ? (length / i - 1) : (length / i);
				System.out.println();
				cutWaste += (length % i);
			}
			System.out.println(lengthSum);
			System.out.println(cutSum);
			System.out.println(cutWaste);
			int profit = lengthSum * salePrice - cutSum * costPerCut - cutWaste * salePrice;
			total = (profit > total) ? (profit) : total;
		}
		System.out.println(total);
		return total;
	}

}
