package Skiena;

public class solution4_33 {

	public static int findIthIndex(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			int temp = mid + 1;
			if (arr[mid] == temp)
				return arr[mid];
			else if (arr[mid] > temp)
				right = mid - 1;
			else
				left = mid + 1;

		}

		return -1;
	}
	
	public static void insertArray(){
		int arr[]={2, 3, 4, 5, 6, 7};
		System.out.println("\nIth Index="+findIthIndex(arr));
	}

}
