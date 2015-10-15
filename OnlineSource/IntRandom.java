package OnlineSource;

import java.util.Random;

public class IntRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		System.out.println(rand7()+"");
	}

	public static  int rand5() {
		Random r = new Random();

		return (r.nextInt(5));
	}

	public static  int rand2() {
		int x = rand5();
		if (x == 4)
			return rand2();
		else
			return (x % 2);
	}

	public static int rand7() {
		int x = 4 * rand2() + 2 * rand2() + rand2();
		if (x == 7)
			return rand7();
		else
			return x;
	}

}
