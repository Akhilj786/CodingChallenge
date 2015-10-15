package LeetCode;

public class CountNSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "1", "11", "21", "1211", "11111221" };
		for(String s:str)
		countSay(s);
	}

	public static void countSay(String fullString) {
		fullString.trim();
		String numbers[] = { "Zero", "One", "Two", "three","four","five" };
		// int numb[] = { 0, 1, 2 };
		int prev = (int) (fullString.charAt(0) - 48);
		int count = 1;
		int i = 1;
		String str1 = numbers[prev];

		for (; i < fullString.length(); i++) {
			int temp = (int) (fullString.charAt(i) - 48);
			if (temp != prev) {
				String str2 = numbers[count];
				System.out.print(str2 + "" + prev+"->");
				count = 1;
				prev = temp;
				str1 = numbers[prev];
			} else {
				count++;
			}
		}

		if (i == fullString.length()) {
			String str2 = numbers[count];
			System.out.println(str2 + "" + prev);
		}

	}

}
