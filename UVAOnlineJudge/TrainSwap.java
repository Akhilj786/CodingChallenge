package UVAOnlineJudge;

import java.util.Scanner;

public class TrainSwap {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int totalTest = s.nextInt();
		int count[] = new int[totalTest];
		while (totalTest > 0) {
			int lengthTrain = s.nextInt();
			int arr[] = new int[lengthTrain];
			for (int i = 0; i < lengthTrain; i++) {
				arr[i] = s.nextInt();
			}

			count[--totalTest] = noSwap(arr, lengthTrain);

		}

		for (int i : count)
			System.out.printf("Optimal train swapping takes %d swaps\n", i);

	}

	public static int noSwap(int array[], int n) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j])
					count++;
			}
		}
		return count;
	}
}
