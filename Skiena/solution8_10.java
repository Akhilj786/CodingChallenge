package Skiena;

public class solution8_10 {
	public static void insertArrary() {
		int array[] = { 100, 200, 300, 600 };
		
		System.out.println("\nIs partition possible?" + partition(array));
	}
	public static boolean partition(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		if (sum % 2 != 0)
			return false;
		else {
			return solution8_9.subsetSum(arr, sum / 2);
		}

	}
}
