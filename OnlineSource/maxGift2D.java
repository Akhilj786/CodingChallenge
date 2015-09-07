package OnlineSource;

public class maxGift2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = { { 1, 10, 3, 8 }, { 12, 2, 9, 1000 }, { 5, 7, 4, 11 },
				{ 3, 7, 16, 5 } };
		maxGift(array);

	}

	public static void maxGift(int array[][]) {
		int sum = array[0][0];
		int i = 0, j = 0;
		while (i < array.length - 1 || j < array.length - 1) {
			int temp[] = findMax(array, i, j);
			i = temp[0];
			j = temp[1];
			sum += array[i][j];
			
		}
		System.out.println(sum + " ");

	}

	public static int[] findMax(int array[][], int i, int j) {
		int temp[] = new int[2];
		int max = Integer.MIN_VALUE;
		if (i == array.length - 2 || j == array.length - 2) {
			if(i==array.length-2 && j==array.length-2){
				temp[0] = array.length - 1;
				temp[1] = array.length - 1;
				return temp;
			}
			
			
		}

		if (i <= array.length - 2) {
			max = array[i + 1][j];
			temp[0] = i + 1;
			temp[1] = j;
		}
		if (j <= array.length - 2 && max < array[i][j + 1]) {
			max = array[i][j + 1];
			temp[0] = i;
			temp[1] = j + 1;
		}

		return temp;
	}
}
