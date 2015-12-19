package HackerRank;

import java.util.Scanner;

public class CheckStringCommon {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		// For loop to run test times
		for (int i = 0; i < test; i++) {
			boolean array[] = new boolean[26];
			String s1 = s.next();
			String s2 = s.next();
			System.out.println(compareString(s1, s2, array));
		}
	}

	public static String compareString(String s1, String s2, boolean str[]) {
		
		for (char c : s1.toLowerCase().toCharArray()) {
			if (c != ' ') {
				int a = (int) c - 97;
				str[a] = true;
				
			}
		}
		
		for (char c : s2.toLowerCase().toCharArray()) {
			if (c != ' ') {
				int a = (int) c - 97;

				if (str[a])
					return "YES";
			}
		}
		return "NO";
	}

}
