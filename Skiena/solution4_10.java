package Skiena;

import java.util.Arrays;

public class solution4_10 {

	public static void insertArray() {
		int a[] = { 6, 9, 11, 14, 19, 21, 24 };
		int sum = 44;
		int k = 3;
		searchKelements(a, sum, k);
	}

	public static void searchKelements(int a[], int sum, int k) {
		if (k > 2) {
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					int val = sum - a[i] - a[j];
					int searchIndex = binarySearch(a, j + 1, a.length - 1, val);
					if (searchIndex != -1) {
						System.out.println(a[i] + " + " + a[j] + " + "
								+ a[searchIndex]);
					}
				}
			}
		}
	}

	public static int binarySearch(int a[], int left, int right, int x) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] > x)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return -1;
	}

}
