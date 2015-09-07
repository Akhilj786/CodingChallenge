package topCoder;

public class MagicDiamonds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long array[] = {2,5,10,3,11, 2147483647L};
		for (long i : array)
			System.out.println(i+"->"+minimalTransfer(i));
	}

	public static long minimalTransfer(long n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 3;
		if (isPrime(n))
			return 2;
		return 1;
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
