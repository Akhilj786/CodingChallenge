package UVAOnlineJudge;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HistoryGrading {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner(System.in);
		Pattern delimiters = Pattern.compile(System.getProperty("line.separator")+"|\\s");
		in.useDelimiter(delimiters); 
		int length = in.nextInt();
		int[] correct = new int[length]; // index -> number that goes at that
											// index (0-based)
		int[] reverse = new int[length + 1]; // number -> index where it should
												// be (1-based)
		for (int i = 1; i <= length; i++) {
			int next = in.nextInt();
			correct[next - 1] = i;
			reverse[i] = next;
		}

		// System.out.println("correct: " + Arrays.toString(correct));
		System.out.println();
		while (in.hasNextInt()) {
			int[] line = new int[length];
			for (int i = 1; i <= length; i++) {
				line[in.nextInt() - 1] = i;
			}

			// System.out.println("student: " + Arrays.toString(line));
			int lis = modifyLIS(line, reverse);
			System.out.println(lis);
		}
	}

	public static int modifyLIS(int array[], int reverse[]) {

		int L[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (reverse[array[i]] > reverse[array[j]]) {
					max = Math.max(max, L[j]);
				}
			}
			L[i] = max + 1;
		}
		int maxQ = L[0];
		for (int i = 1; i < array.length; i++)
			maxQ = Math.max(maxQ, L[i]);
		return maxQ;
	}

}
