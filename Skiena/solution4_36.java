package Skiena;

public class solution4_36 {

	public static void insertArray() {
		// TODO Auto-generated method stub

		int array[][] = { {  1, 2,3 }, { -1, 1, 2 }, { -2, -1, 1 } };
		System.out.println("No of Zero:" + countZero(array));

	}

	/*
	 * Logic:
	 * In the first row find position of zero-> firstIndex
	 * And then search diagonally 
	 */
	
	public static int countZero(int a[][]) {
		int count = 0;
		binarySearch b = new binarySearch(a[0]);
		int firstIndex = b.binarySearchX(0, 0, a[0].length - 1);
		System.out.println("First Index"+firstIndex);
		if (firstIndex == -1) {
			firstIndex = a[0].length - 1;
			count = 0;
		} else
			count = 1;

		int row = 1;
		int col = firstIndex + 1;

		while (row <= a.length - 1 && col <= a.length - 1) {
			if (a[row][col] == 0) {
				count++;
				row++;
				col++;
			} else if (a[row][col] < 0)
				col++;
			else
				row++;
		}

		return count;
	}

}
