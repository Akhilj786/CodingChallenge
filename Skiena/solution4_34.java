package Skiena;

public class solution4_34 {

	public static int doGetSmallest(int arr[], int left, int right) {
		if (left > arr.length - 1)
			return -1;

		if (left > right)
			return left + 1;
		int mid = (left + right) / 2;
		if (arr[mid] > mid + 1)
			return (doGetSmallest(arr, left, mid - 1));
		else
			return (doGetSmallest(arr, mid + 1, right));

	}

	public static int doGetSmallestIterative(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		if (arr[right] == (right + 1))
			return -1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == (mid + 1))
				left = mid + 1;
			else
				right = mid - 1;

		}

		return left + 1;

	}

	public static void insertArray() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15 };
		System.out.println("\n Smallest Integer:"
				+ doGetSmallest(arr, 0, arr.length - 1));
		System.out
				.println("\n Smallest Integer:" + doGetSmallestIterative(arr));

	}

}
