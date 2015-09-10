package LeetCode;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram1("anagram", "nagaram"));
		System.out.println(isAnagram1("anagram", "nagaram"));
	}

	public static boolean isAnagram1(String s1, String s2) {
		long stime = System.nanoTime();
		long etime = 0;
		if (s1 == null && s2 == null)
			return true;
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length())
			return false;
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {

			if (c1[i] != c2[i]) {
				etime = System.nanoTime();
				System.out.println((etime - stime));
				return false;
			}
		}
		etime = System.nanoTime();
		System.out.println((etime - stime) / (Math.pow(10, 6)));
		return true;

	}

	public static boolean isAnagram2(String s1, String s2) {

		long stime = System.nanoTime();
		long etime = 0;
		if (s1 == null && s2 == null)
			return true;
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() != s2.length())
			return false;

		int count[] = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			count[(int) c]++;

		}
		for (int i = 0; i < s2.length(); i++) {
			char c = s1.charAt(i);
			count[(int) c]--;
			if (count[(int) c] < 0)
				return false;
		}

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (count[(int) c] != 0)
				return false;
		}
		etime = System.nanoTime();
		System.out.println((etime - stime) / (Math.pow(10, 6)));
		return true;
	}

}
