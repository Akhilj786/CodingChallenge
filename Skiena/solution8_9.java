package Skiena;

public class solution8_9 {

	public static void insertArrary() {
		int array[] = { 100, 200, 400, 600 };
		int sum = 500;
		System.out.println("\nIs subset sum possible?" + subsetSum(array, sum));
	}

	public static boolean subsetSum(int arr[], int sum) {

		boolean subset[][] = new boolean[arr.length + 1][sum + 1];

		// Initialize true array:
		for (int i = 0; i < arr.length + 1; i++)
			subset[i][0] = true;

		for (int i = 1; i <= arr.length; i++) {
			for (int j = 1; j <= sum; j++) {

				if (arr[i - 1] > j) {
					/*
					 * If current element > required sum Just copy value from
					 * above. Else go few column before and check.
					 */
					subset[i][j] = subset[i - 1][j];
				} else {
					subset[i][j] = subset[i - 1][j]
							|| subset[i - 1][j - arr[i - 1]];
				}
			}
		}
		System.out.println("Subset:");
		printSet(subset, arr, sum);
		return subset[arr.length][sum];

	}

	// Print Set
	public static void printSet(boolean subset[][], int arr[], int sum) {
		int i = arr.length;
		int j = sum;
		while (true) {
			// Element contained in the ans
			if (i <= 0 || j <= 0)
				break;
			if (subset[i][j] == true && subset[i - 1][j] == false) {
				System.out.print(arr[i - 1] + " ");
				i = i - 1;
				j = j - arr[i];
			} else {
				i--;
			}

		}

	}
}
