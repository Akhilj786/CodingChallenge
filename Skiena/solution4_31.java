package Skiena;

public class solution4_31 {

	public static int findRotateMax(int a[]) {
		if (a[0] < a[a.length - 1])
			return a.length - 1;

		int left = 0;
		int right = a.length - 1;
		while (left <= right) {
			/*
			 * if(left==right) return left;
			 * 
			 * 
			 * if(a[left]>a[mid]) right=mid-1; else left=mid+1;
			 */
			int mid = (left + right) / 2;
			if (a[left] > a[mid]) {
				if (a[mid - 1] > a[mid])
					return mid - 1;
				else
					right = mid - 1;

			} else {
				if (a[mid] > a[mid + 1])
					return mid;
				else
					left = mid + 1;
			}

		}
		return -1;

	}

	public static void insertArray() {
		int a[] = { 27, 29, 35, 42, 5 };
		System.out.println("Found:" + a[findRotateMax(a)]);
	}

}
