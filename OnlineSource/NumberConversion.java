package OnlineSource;
// Binary to Decimal and vice versa.
public class NumberConversion {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int array[] = { 0, 1, 2, 3, 4, 7 };
		for (int i : array)
			decimalToBinary(i);
		String str = "0";
		binaryToDecimal(str);
	}

	public static void decimalToBinary(int n) {
		if (n == 0)
			System.out.print("0");
		String res = "";
		while (n > 0) {
			int rem = n % 2;
			res = rem + res;
			n = n / 2;
		}
		System.out.println(res);
	}

	public static void binaryToDecimal(String str) {
		if (str == null || str.length() == 0) {
			System.out.println("Error");
			return;
		}
		int res = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			int temp = (int) c - '0';
			if (temp == 1)
				res += Math.pow(2, str.length() - 1 - i);

		}
		System.out.println(res);

	}
}
