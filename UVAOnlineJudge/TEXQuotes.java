package UVAOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEXQuotes {

	static boolean onLeft = true;

	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String result = "";
		while ((s = in.readLine()) != null && s.length() != 0)
			// System.out.println(replaceQuotes(s));
			result += replaceQuotes(s) + "\n";
		System.out.println(result);
	}

	public static String replaceQuotes(String line) {
		String formattedString = "";
		for (int i = 0; i < line.length(); i++) {
			char curr = line.charAt(i);
			if (curr == '"') {
				if (onLeft)
					formattedString += "``";
				else
					formattedString += "''";
				onLeft = !onLeft;
			} else
				formattedString += curr;
		}
		return formattedString;
	}

}
