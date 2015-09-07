package topCoder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//http://community.topcoder.com/stat?c=problem_statement&pm=11564
public class Cut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = new FileReader(
				"Input.txt");
		BufferedReader br = new BufferedReader(in);
		String line;
		while ((line = br.readLine()) != null) {
			String splitArray[] = line.split("}, ");
			int len = splitArray[0].length();
			String intArray[] = splitArray[0].substring(1, len).split(",");
			int maxCut = Integer.parseInt(splitArray[1]);

			int array[] = new int[intArray.length];

			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(intArray[i].trim());

			}

			System.out.println(getMaximum(array, maxCut));

		}

	}

	public static int getMaximum(int[] eelLengths, int maxCuts) {
		int maxCut = 0;
		if (maxCuts <= 0)
			return 0;
		ArrayList<Integer> elem = new ArrayList<>();
		for (int i : eelLengths) {
			if (i == 10)
				maxCut++;
			else if (i > 10)
				elem.add(i);
			else
				continue;
		}

		Collections.sort(elem);
		Collections.reverse(elem);

		for (int i : elem) {
			int rem = i % 10;
			int div = i / 10;
			int cut = 0;
			int partition = div;
			if (rem == 0) {

				cut = div - 1;

			} else {
				cut = div;
			}
			int diff = maxCuts - cut;
			if (diff >= 0) {
				maxCut += partition;
				maxCuts -= cut;
			} else {
				maxCut += maxCuts;
				break;
			}

		}

		return maxCut;
	}

}
