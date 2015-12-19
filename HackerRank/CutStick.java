package HackerRank;

import java.util.*;

public class CutStick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int stick[] = new int[len];
		for (int i = 0; i < len; i++)
			stick[i] = s.nextInt();
		cutStick(stick);
	}

	public static void cutStick(int stick[]) {
		boolean flag = true;
		while (flag) {
			int min = findMin(stick);
			int cut = cutMin(stick, min);
			if (cut == 0) {
				flag = false;
			} else {
				System.out.println(cut);
			}
		}
	}

	public static int findMin(int stick[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < stick.length; i++) {
			if (min > stick[i] && stick[i]!=0)
				min = stick[i];
		}
		return min;
	}

	public static int cutMin(int stick[], int min) {
		int count = 0;
		for (int i = 0; i < stick.length; i++) {
			
			if (stick[i] == 0)
				continue;
			stick[i] = stick[i] - min;
			count++;
		}
		return count;
	}

}
