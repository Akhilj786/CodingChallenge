package ProgrammingElements.Chapter6;

public class MainSol6 {

	public static void main(String args[]) {
		// solution to longest subarray.
		int array1[] = { -1, -1, -1, 0, 0, 0 };
		solution6_2 sol6_2 = new solution6_2();
		System.out.println(sol6_2.longestEqualArray(array1));

		// solution to maximum multiple buy and sell.
		int array2[] = { 100, 180, 260, 310, 40, 535, 695 };
		solution6_3 sol6_3 = new solution6_3();
		sol6_3.multiProfit(array2);
	}
}
