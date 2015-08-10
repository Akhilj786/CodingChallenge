package Skiena;

public class binarySearch {
	int array[];

	binarySearch(int a[]) {
		this.array = new int[a.length];

		// Deep Copy
		for (int i = 0; i < a.length; i++) {
			this.array[i] = a[i];
		}
	}

	public int binarySearchX(int x, int left, int right) {
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == x)
				return mid;
			else if (array[mid] > x)
				right = mid - 1;
			else
				left = mid + 1;
		}

		return -1;
	}
}
