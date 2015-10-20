package LeetCode;

public class checkSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = { "123456789", "456789123", "789123456", "891234567",
				"234467891", "567891234", "678912345", "912345678", "345678912" };
		int board[][] = formBoard(str);
		System.out.println(isValidSudoku(board));

	}

	public static int[][] formBoard(String str[]) {
		int board[][] = new int[9][9];
		for (int i = 0; i < 9; i++) {
			String s = str[i];
			for (int j = 0; j < s.length(); j++) {
				int cell = s.charAt(j) - 48;
				board[i][j] = cell;
			}
		}
		return board;

	}

	public static boolean isValidSudoku(int board[][]) {
		boolean[][] rows = new boolean[9][9];
		boolean[][] columns = new boolean[9][9];
		boolean[][] cells = new boolean[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				int num = board[i][j] - 1;
				if (rows[i][num] || columns[j][num]
						|| cells[i / 3 * 3 + j / 3][num]) {
					return false;
				}
				rows[i][num] = columns[j][num] = cells[i / 3 * 3 + j / 3][num] = true;
			}
		}
		return true;
	}

}
