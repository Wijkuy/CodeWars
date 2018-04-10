import java.util.Arrays;

public class TruthTable {

	public static void main(String[] args) {
		int input = 3;
		int states = (int) Math.pow(2, input);
		int[][] truthtable = new int[states][input];
		generateTruthTable(truthtable, input, states, input);
		printTable(truthtable);
	}

	static void generateTruthTable(int[][] truthtable, int input, int states, int original) {
		if (input > 0) {
			// number of rows that will have the same state
			int repeatlength = (int) Math.pow(2, input - 1);
			// number of switches that will be made
			int switches = states / repeatlength;
			// initial state
			boolean state = false;
			for (int i = 0; i < switches; i++) {
				for (int j = 0; j < repeatlength; j++) {
					int output = state == true ? 1 : 0;
					truthtable[(i * repeatlength) + j][original - input] = output;
					state = j == repeatlength - 1 ? !state : state;
				}
			}
			generateTruthTable(truthtable, input - 1, states, original);
		}
	}

	static void printTable(int[][] truthtable) {
		for (int i = 0; i < truthtable.length; i++) {
			for (int j = 0; j < truthtable[0].length; j++) {
				System.out.print(truthtable[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
